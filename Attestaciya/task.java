import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            processData("Иванов Иван Иванович 01.01.1990 1234567890 m");
        } catch (DataFormatException | IllegalArgumentException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void processData(String input) throws DataFormatException, IOException {
        String[] data = input.split(" ");
        int expectedDataLength = 6;
        if (data.length != expectedDataLength) {
            throw new DataFormatException("Invalid number of data fields.");
        }

        String surname = data[0];
        String name = data[1];
        String patronymic = data[2];
        String dateOfBirth = data[3];
        long phoneNumber;
        char gender;

        try {
            phoneNumber = Long.parseLong(data[4]);
            if (phoneNumber < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            throw new DataFormatException("Invalid phone number format.");
        }

        if (data[5].length() != 1 || (!data[5].equals("m") && !data[5].equals("f"))) {
            throw new DataFormatException("Invalid gender format.");
        }
        gender = data[5].charAt(0);

        String output = surname + name + patronymic + " " + dateOfBirth + " " + phoneNumber + " " + gender;
        writeToDataFile(surname, output);
    }

    public static void writeToDataFile(String surname, String data) throws IOException {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(surname + ".txt", true);
            fileWriter.write(data + "\n");
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}

class DataFormatException extends Exception {
    public DataFormatException(String message) {
        super(message);
    }
}

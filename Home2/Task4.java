import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String input = getStringInput();
            System.out.println("Вы ввели: " + input);
        } catch (EmptyStringException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    
    public static String getStringInput() throws EmptyStringException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        
        if (input.isEmpty()) {
            throw new EmptyStringException("Пустые строки вводить нельзя.");
        }
        
        return input;
    }
}

class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }
}

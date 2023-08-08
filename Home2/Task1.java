import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float userInput = getFloatInput();
        System.out.println("Вы ввели: " + userInput);
    }
    
    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float inputNumber = 0.0f;
        boolean validInput = false;
        
        while (!validInput) {
            System.out.print("Введите дробное число: ");
            
            if (scanner.hasNextFloat()) {
                inputNumber = scanner.nextFloat();
                validInput = true;
            } else {
                System.out.println("Ошибка ввода! Введите корректное дробное число.");
                scanner.nextLine(); // Очистка буфера после некорректного ввода
            }
        }
        
        return inputNumber;
    }
}

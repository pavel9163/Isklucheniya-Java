import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = new int[2]; // Исправление: создание массива с двумя элементами
            abc[1] = 9; // Исправление: присвоение элементу с индексом 1 значения 9
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Индекс выходит за пределы массива!");
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}

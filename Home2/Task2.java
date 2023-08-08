public class Main {
    public static void main(String[] args) {
        try {
            int[] intArray = new int[5]; // Пример массива с пятью элементами
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching ArithmeticException: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching ArrayIndexOutOfBoundsException: " + e);
        }
    }
}

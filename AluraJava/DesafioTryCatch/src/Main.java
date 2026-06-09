import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("First value: ");
            int ValueOne = scanner.nextInt();

            System.out.println("Second value: ");
            int ValueTwo = scanner.nextInt();

            System.out.println(ValueOne + " divide by " + ValueTwo + " is " + ValueOne / ValueTwo);

        } catch (ArithmeticException error) {
            System.out.println("You cannot divide by zero!");

        } catch (InputMismatchException error) {
            System.out.println("Use only integers!");

        } catch (Exception error) {
            System.out.println("Something went wrong!");

        } finally {
            System.out.println("The program has finalized as expected");
        }
    }
}

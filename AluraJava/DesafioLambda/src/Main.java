import interfaces.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Multiplication multiplication = (x, y) -> x * y;
        System.out.println(multiplication.multi(5, 2));

        PrimeNumber primeNumber = (x) -> {
            if (x < 2) {
                return false;
            }

            for (int i = 2; i * i <= x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(primeNumber.isPrime(1));
        System.out.println(primeNumber.isPrime(2));
        System.out.println(primeNumber.isPrime(3));
        System.out.println(primeNumber.isPrime(4));
        System.out.println(primeNumber.isPrime(5));
        System.out.println(primeNumber.isPrime(6));

        System.out.print("Word: ");
        String word = scanner.nextLine();

        ToUpper upper = String::toUpperCase;
        System.out.println(upper.upper(word));

        System.out.print("Is a palindrome? ");
        String wordPalindrome = scanner.nextLine();

        Palindrome palindrome = x -> {if (Boolean.parseBoolean(String.valueOf
                (new StringBuilder(x).reverse().toString().equals(x)))) return true;
            return false;
        };

        System.out.println(palindrome.isPalindrome(wordPalindrome));

        ListMulti lista = x -> {
            for (int i = 0; i < x.size(); i++) {
                x.set(i, x.get(i) * 3);
            }
            return x;
        };
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(100);

        System.out.println(lista.multiply(list));

        AlphabeticalOrder alphabeticalOrder = x -> {
            Collections.sort(x);
            return x;
        };

        ArrayList<String> tobeOrdered = new ArrayList<>();
        tobeOrdered.add("c");
        tobeOrdered.add("d");
        tobeOrdered.add("a");
        tobeOrdered.add("b");

        System.out.println(tobeOrdered);
        System.out.println(alphabeticalOrder.alphabetical(tobeOrdered));

        DivideXbyY divideXbyY = (x, y) -> {
            try {
                System.out.println(x / y);
            } catch (ArithmeticException e) {
                System.out.println("Can't divide by 0");
            }
        };

        divideXbyY.division(10, 2);
        divideXbyY.division(10, 0);
    }
}
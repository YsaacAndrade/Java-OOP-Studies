import org.w3c.dom.ls.LSOutput;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> biggestNumber = numbers.stream().filter(n -> {
            for (Integer integer : numbers) {
                if (integer > n) {
                    return false;
                }
            }
            return true;
        }).toList();

        List<String> words = Arrays.asList("java", "stream", "lambda", "code");
        Map<Integer, List<String>> wordsPerSize = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(wordsPerSize);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        String namesWithComma = String.join(", ", names);
        System.out.println(namesWithComma);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int numbersSum = numbers.stream().filter(i -> i % 2 == 0)
                .map(i -> i * i).mapToInt(Integer::intValue).sum();
        System.out.println(numbersSum);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<String, List<Integer>> map = numbers.stream().collect(Collectors.groupingBy(
                i -> i % 2 == 0 ? "pair" : "odd"
        ));
        System.out.println(map);


        List<Products> products = Arrays.asList(
                new Products("Smartphone", 800.0, "Electronics"),
                new Products("Notebook", 1500.0, "Electronics"),
                new Products("Keyboard", 200.0, "Electronics"),
                new Products("Chair", 300.0, "Furniture"),
                new Products("Monitor", 900.0, "Electronics"),
                new Products("Table", 700.0, "Furniture")
        );

        Map<String, List<Products>> map = products.stream().collect(Collectors.groupingBy(
                Products::getCategory
        ));
        map.forEach((Category, Products) -> System.out.println(Category + " = " + products));

        Map<String, Long> howManyProducts = products.stream().collect(Collectors.groupingBy(Products::getCategory, Collectors.counting()));
        System.out.println(howManyProducts);

        Map<String, Optional<Products>> highPrice = products.stream().collect(Collectors
                .groupingBy(Products::getCategory, Collectors.maxBy(Comparator.comparingDouble(Products::getPrice))));
        System.out.println(highPrice);
    }
}
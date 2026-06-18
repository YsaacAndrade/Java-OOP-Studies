import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> even = numbers.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(even);

        List<String> words = Arrays.asList("java", "stream", "lambda");
        List<String> wordsUpper = words.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(wordsUpper);

        List<Integer> oddnumbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> multiplyOdd = oddnumbers.stream().filter(s -> s % 2 != 0)
                .map(s -> s * 2).collect(Collectors.toList());
        System.out.println(multiplyOdd);

        List<String> wordsrepeated = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        List<String> wordsnormal = wordsrepeated.stream().distinct().collect(Collectors.toList());
        System.out.println(wordsnormal);

        List<List<Integer>> numberList = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );
        List<Integer> primeNumbers = numberList.stream().flatMap(List::stream)
                .filter( s -> { if (s >= 2) {
            for (int i = 2; i < s; i++) {
                if (s % i == 0) {
                    return false;
                }
            }
            return true;
        }return false;
        }).toList();
        System.out.println(primeNumbers);
        List<Person> personList = Arrays.asList(
                new Person("Alice", 22),
                new Person("Bob", 17),
                new Person("Charlie", 19)
        );
        List<Person> old = personList.stream().filter(s -> s.getAge() > 18)
                .sorted(Comparator.comparing(Person::getName)).toList();
        for (Person person : old) {
            System.out.println(person.getName());
        }

        List<Product> products = Arrays.asList(
                new Product("Smartphone", 800.0, "Eletrônicos"),
                new Product("Notebook", 1500.0, "Eletrônicos"),
                new Product("Teclado", 200.0, "Eletrônicos"),
                new Product("Cadeira", 300.0, "Móveis"),
                new Product("Monitor", 900.0, "Eletrônicos"),
                new Product("Mesa", 700.0, "Móveis")
        );

        List<Product> newProductList = products.stream().filter(s -> s.getCategory().equals("Eletrônicos"))
                .filter(s -> s.getPrice() < 1000).sorted(Comparator.comparing(Product::getPrice)).toList();
        for (Product product : newProductList) {
            System.out.println(product.getName());
        }
        List<Product> cheapsProducts = products.stream().sorted(Comparator.comparing(Product::getPrice))
                .limit(3).toList();
        for (Product product : cheapsProducts) {
            System.out.println(product.getName());
        }
    }
}
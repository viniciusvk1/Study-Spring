package exercises;

// Print only odd numbers from the list

import java.util.List;

public class E1 {
    public static void main(String[] args) {

        printOddNumbersInListStructured(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));

    }

    public static void printOddNumbersInListStructured(List<Integer> numbers) {

        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }

}
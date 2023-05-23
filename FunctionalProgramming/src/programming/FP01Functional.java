package programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        // Print All numbers in list structured
        printEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

    }

    // number -> number % 2 == 0
    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        // What to do?
        numbers.stream()
                // Filter - Only allow even numbers
                //.filter(FP01Functional::isEven)
                .filter(number -> number % 2 == 0) // Lambda Expression
                .forEach(System.out::println);//method reference

    }
}


package programming;

import java.util.List;

public class FP01FunctionalMapping {
    public static void main(String[] args) {
        // Print All numbers in list structured
        printSquaresOfEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

    }

    // number -> number % 2 == 0
    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        // What to do?
        numbers.stream()
                // Filter - Only allow even numbers
                //.filter(FP01Functional::isEven)
                .filter(number -> number % 2 == 0) // Lambda Expression
                //mapping - x -> x * x
                .map(number -> number * number)
                .forEach(System.out::println);//method reference

    }
}


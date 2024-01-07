package programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        printSquaresOfEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        printCubesOfNonEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        printAllStringInListFunctional(List.of("Spring", "Boot", "Application", "Java", "Functional", "Programming"));
    }
    private static void print(int number) {
        System.out.println(number);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // What to do?
        System.out.println("\nPrinting all numbers in list\n");
        numbers.forEach(FP01Functional::print); // Method Reference

        System.out.println("\nPrinting all even numbers in list\n");
        numbers.stream() // Convert to Stream
                .filter(number -> number % 2 == 0) // Lambda Expression
                .forEach(System.out::println); // Method Reference
    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> integers) {
        System.out.println("\nPrinting squares of even numbers in list\n");
        integers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    private static void printCubesOfNonEvenNumbersInListFunctional(List<Integer> integers) {
        System.out.println("\nPrinting cubes of non-even numbers in list\n");
        integers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }


    private static void printAllStringInListFunctional(List<String> strings) {
        System.out.println("\nPrinting all strings in list\n");
        strings.stream()
                .forEach(System.out::println);

        System.out.println("\nPrinting all strings which contains 'Spring' in list\n");
        strings.stream()
                .filter(string -> string.contains("Spring"))
                .forEach(System.out::println);

        System.out.println("\nPrinting all strings with a length of 4 in list\n");
        strings.stream()
                .filter(string -> string.length() == 4)
                .forEach(System.out::println);

        System.out.println("\nPrinting the lengths of all the strings in the list \n");
        strings.stream()
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("\nPrinting the string + the length of the string in the list \n");
        strings.stream()
                .map(string -> string + " " + string.length())
                .forEach(System.out::println);
    }
}

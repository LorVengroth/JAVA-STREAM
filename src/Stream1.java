import java.util.Arrays;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {


        // Exercise 1

        //  You have a list of integers.
        List<Integer> numbers = Arrays.asList(12, 67, 45, 89, 23, 55, 91, 4, 100);

        // You need to find out how many of those numbers are greater than 50
        long count = numbers.stream()
                .filter(n -> n > 50)     // Only keep numbers > 50
                .count();                       // Count the remaining elements

        System.out.println("Numbers greater than 50: " + count);


        // Now print that 5 element
        numbers.stream()
                .filter( n -> n > 50)
                .forEach(System.out::println);


        // filter( Predicate ) This takes a "Predicate" (a true/false condition).
        // If the condition is true, the item stays on the "conveyor belt."

    }
}

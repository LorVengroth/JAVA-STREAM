import java.util.Arrays;
import java.util.List;

public class Stream5 {
    public static void main(String[] args) {

        // exercise 5

        List<String> users = Arrays.asList("Alice", "Bob", "Charlie", "David", "Chuck");

        String result = users.stream()
                .filter(name -> name.startsWith("C")) // Find names starting with 'C'
                .findFirst()                         // Grab only the first one that passes
                .orElse("No user found");            // If the list was empty or no 'C' names, use this

        System.out.println("Result: " + result);



        List<String> allCNames = users.stream()
                .filter(name -> name.startsWith("C")) // Find ALL names starting with 'C'
                .toList();                    ,        // Gather them into a list

        System.out.println("Users starting with C: " + allCNames);


    }
}

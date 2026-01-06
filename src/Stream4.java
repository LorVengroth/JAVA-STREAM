import java.util.Arrays;
import java.util.List;

public class Stream4 {
    public static void main(String[] args) {

        // exercise 4

        List<String> guests = Arrays.asList("Anna", "Bob", "Anna", "Charlie", "Bob", "Zoe");


        // delete the duplicate
        List<String> cleanList = guests.stream()
                .distinct()           // Step 1: Remove duplicates
                .sorted()             // Step 2: Sort alphabetically (A-Z)
                .toList();            // Step 3: Save to a list

        System.out.println("Clean Guest List: " + cleanList);


    }
}

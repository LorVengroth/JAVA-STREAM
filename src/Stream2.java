import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {

        // Exercise 2


        //You have a list of strings (names).
        List<String> names = Arrays.asList("kim", "amanda", "bob", "steven", "joe");


        // You want to transform them so that they are all uppercase
        // and you only want to keep the ones that have more than 4 letters.
        List<String> result = names.stream()
                .filter( s -> s.length() > 4)
                .map(String::toUpperCase)
                .toList();      // With .toList() (The result is "saved")
        System.out.println(result);


        /*
        You don't need .toList() if you are finishing the Stream with a different "Terminal Operation" like:

            .count() (you just want a number)

            .sum() (you just want a total)

            .forEach() (you just want to print to the screen)
         */
    }
}

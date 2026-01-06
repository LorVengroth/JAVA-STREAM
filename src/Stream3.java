import java.util.Arrays;
import java.util.List;

public class Stream3 {
    public static void main(String[] args) {


    // exercise 3

        List<Double> prices = Arrays.asList(5.0, 15.5, 20.0, 8.25, 30.0);


        /*
        1. Filter the prices (> 10.0).

        2. Map them to a "Primitive" stream using .mapToDouble() (this makes math easier).

        3. Use .sum() to get the total.
         */



        double total = prices.stream()
                .filter(p -> p > 10.0)      // Filter prices > 10
                .mapToDouble(p -> p)       // Convert to DoubleStream for math
                .sum();                    // Calculate the total

        System.out.println("Total Sum: $" + total);

    }
}

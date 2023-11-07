package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
        List<Integer> squares = numbers.stream()
                                       .map(x -> x * x)
                                       .collect(Collectors.toList());

        System.out.println(squares);

        List<String> names = Arrays.asList(
            "Reflection", "Collection", "Stream"
        );

        List<String> result
            = names.stream()
              .filter(s -> s.startsWith("S"))
              .collect(Collectors.toList());
        
        System.out.println(result);

        List<String> show
            = names.stream()
              .sorted()
              .collect(Collectors.toList());

        System.out.println(show);

        List<Integer> numbers2
            = Arrays.asList(2, 3, 4, 5, 2);
        
        Set<Integer> squareSet
            = numbers2.stream()
              .map(x -> x * x)
              .collect(Collectors.toSet());
        
        System.out.println(squareSet);

        numbers2.stream()
                .map(x -> x * x)
                .forEach(y -> System.out.print(y + " "));
        
        System.out.println();
        System.out.println(numbers2);

        int even
            = numbers2.stream()
                      .filter(x -> x % 2 == 0)
                      .reduce(0, (ans, i) -> ans + i);  
        
        System.out.println(even);

    }
}

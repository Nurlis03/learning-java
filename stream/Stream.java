package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
        List<Integer> squares = numbers.stream().map(x -> x * x).collect(Collectors.toList());
    }
}

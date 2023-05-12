import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println("Original: " + numbers);

        List<Integer> successors = transform(numbers, x -> x + 1);
        System.out.println("+1: " + successors);

        List<Integer> triples = transform(numbers, x -> 3 * x);
        System.out.println("x3: " + triples);
    }

    static <T, R> List<R> transform(List<? extends T> list, Function<T, R> function) {
        List<R> newList = new ArrayList<>();
        for (T t : list) {
            newList.add(function.apply(t));
        }
        return newList;
    }
}
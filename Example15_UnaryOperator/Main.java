import java.util.*;
//import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println("Original: " + numbers);

        numbers.replaceAll(x -> x + 1);
        System.out.println("+1: " + numbers);

        numbers.replaceAll(x -> x * 3);
        System.out.println("x3: " + numbers);
    }

}
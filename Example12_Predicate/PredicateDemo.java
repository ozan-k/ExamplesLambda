import java.util.*;
public class PredicateDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println("All numbers: " + numbers);

        numbers.removeIf(number -> number % 2 != 0);
        System.out.println("Only even numbers: " + numbers);
    }
}
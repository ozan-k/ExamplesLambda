import java.util.*;

class Main{
    public static void main(String[] args) {
        int multiplier = 2;
        List.of(1, 2, 3, 4).forEach(x -> System.out.println(x * multiplier));

        // int sum = 0;
        // This will not compile!
        // List.of(1, 2, 3, 4).forEach(x -> sum += x);
    }
}

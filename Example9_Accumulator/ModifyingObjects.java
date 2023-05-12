import java.util.*;

public class ModifyingObjects {
    public static void main(String[] args) {
        Accumulator acc = new Accumulator(0);
        System.out.println("Before: " +  acc.value);
        List.of(1, 2, 3, 4).forEach(x -> acc.add(x));
        System.out.println("After: " +  acc.value);
    }
}
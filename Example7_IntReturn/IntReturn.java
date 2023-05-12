import java.util.*;
import java.util.function.BinaryOperator;

public class IntReturn {
  public static void main(String[] args) {
    int[] values = {1, 2, 3, 4};

    int sum = reduce(values, 0, (x, y) -> x + y);
    System.out.println("Sum: " + sum);

    int product = reduce(values, 1, (x,  y) -> x * y);
    System.out.println("Product: " + product);

    int sumOfSquares =
        reduce(
            values,
            0,
            (x, y) -> {
              int ySquared = (int) Math.pow(y, 2);
              return x + ySquared;
            });

    System.out.println("Sum of squares: " + sumOfSquares);
  }

  static int reduce(int[] array, int initial, BinaryOperator<Integer> operator) {
    for (int value : array) {
      initial = operator.apply(initial, value);
    }

    return initial;
  }
}

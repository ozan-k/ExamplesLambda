import java.util.*;
import java.util.function.Predicate;
public class LogicCollection {
    public static <T> boolean all(Collection<? extends T> collection,Predicate<T> predicate){
        for (T item : collection){
            if (!predicate.test(item)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean exists(Collection<? extends T> collection,Predicate<T> predicate){
        for (T item : collection){
            if (predicate.test(item)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean none(Collection<? extends T> collection,Predicate<T> predicate){
        for (T item : collection){
            if (predicate.test(item)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        boolean allLessThanTen = LogicCollection.all(numbers, x -> x < 10);
        System.out.println("All numbers are lesser than 10: " + allLessThanTen);

        boolean allEven = LogicCollection.all(numbers, x -> x % 2 == 0);
        System.out.println("All numbers are even: " + allEven);

        boolean existsMultipleFive = LogicCollection.exists(numbers, x -> x % 5 == 0);
        System.out.println("There is a multiple of 5: " + existsMultipleFive);

        boolean existsTen = LogicCollection.exists(numbers, x -> x == 10);
        System.out.println("There is a 10: " + existsTen);

        boolean noNegative = LogicCollection.none(numbers, x -> x < 0);
        System.out.println("There are no negative numbers: " + noNegative);

        boolean noZero = LogicCollection.none(numbers, x -> x == 0);
        System.out.println("There are no zeroes: " + noZero);
    }
}
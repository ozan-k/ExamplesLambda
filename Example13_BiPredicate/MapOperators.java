import java.util.*;
import java.util.function.BiPredicate;

public class MapOperators {
    static <T, U> void filter(Map<T, U> map, BiPredicate<T, U> predicate) {
        Iterator<Map.Entry<T, U>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<T, U> entry = iterator.next();
            T key = entry.getKey();
            U value = entry.getValue();

            if (predicate.test(key, value)) {
                iterator.remove();
            }
        }
    }

    static <T, U> Map<T, U> copyIf(Map<T, U> map, BiPredicate<T, U> predicate) {
        Map<T, U> copy = new HashMap<>();
        for (Map.Entry<T, U> entry : map.entrySet()) {
            T key = entry.getKey();
            U value = entry.getValue();

            if (predicate.test(key, value)) {
                copy.put(key, value);
            }
        }
        return copy;
    }
}
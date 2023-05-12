import java.util.HashMap;
import java.util.Map;

public class BiConsumerDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Reverse Giraffe", "parasite");
        map.put("Morty", "person");
        map.put("Sleepy Gary", "parasite");
        map.put("Beth", "person");
        map.put("Hamuray", "parasite");

        map.forEach(
                (character, nature) ->
                        System.out.println(
                                character + ": I'm not a parasite! (" + !nature.equals("parasite") + ")"));
    }
}
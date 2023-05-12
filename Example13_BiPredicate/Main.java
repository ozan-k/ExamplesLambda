import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Reverse Giraffe", "parasite");
        map.put("Morty", "person");
        map.put("Sleepy Gary", "parasite");
        map.put("Beth", "person");
        map.put("Hamuray", "parasite");

        System.out.println("Original: " + map);

        Map<String, String> parasiteMap = MapOperators.copyIf(map, (name, nature) -> nature.equals("parasite"));
        System.out.println("Copy (if parasite): " + parasiteMap);

        MapOperators.filter(map, (name, nature) -> !name.equals("Morty") || !nature.equals("person"));
        System.out.println("Map without a Morty: " + map);
    }
}
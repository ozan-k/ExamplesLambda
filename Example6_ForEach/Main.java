import java.util.*;

public class Main {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    map.put("Reverse Giraffe", "parasite");
    map.put("Morty", "person");
    map.put("Sleepy Gary", "parasite");
    map.put("Beth", "person");
    map.put("Hamuray", "parasite");

    map.keySet().forEach(
      character -> System.out.println(character + ": I'm real!"));

    map.keySet().forEach(
      (character) -> System.out.println(character + ": Are you real?"));

    map.forEach(
      (character, nature) -> System.out.println(character + ": I'm a " + nature));

    map.forEach(
        (String character, String nature) -> System.out.println(character + ": I'm a " + nature));

    map.forEach(
        (character, nature) -> {
          if (nature.equals("person")) {
            System.out.println(character + ": Kill the parasites!");
          }
        });
  }
}

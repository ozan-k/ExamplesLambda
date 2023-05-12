import java.util.*;

public class Main {
  public static void main(String[] args) {
    Character rick = new Character("Rick", "Sanchez");
    Character morty = new Character("Morty", "Smith");
    Character scary = new Character("Scary", "Terry");
    List<Character> characters = List.of(rick, morty, scary);

    Helloable custom =
        c -> System.out.println("Hello " + c.firstName.charAt(0) + ". " + c.lastName);

    for (Character c : characters) {
      custom.sayHello(c);
    }
  }
}

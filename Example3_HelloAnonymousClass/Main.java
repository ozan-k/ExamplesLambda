import java.util.*;

public class Main {
  public static void main(String[] args) {
    Character rick = new Character("Rick", "Sanchez");
    Character morty = new Character("Morty", "Smith");
    Character scary = new Character("Scary", "Terry");
    List<Character> characters = List.of(rick, morty, scary);

    Helloable custom =
        new Helloable() {
          @Override
          public void sayHello(Character character) {
            System.out.println("Hello " + character.firstName.charAt(0) + ". " + character.lastName);
          }
        };

    for (Character c : characters)
      custom.sayHello(c);
  }
}

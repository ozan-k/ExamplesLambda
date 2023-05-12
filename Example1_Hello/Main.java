import java.util.*;

public class Main {

  public static void main(String[] args) {
    Character rick = new Character("Rick", "Sanchez");
    Character morty = new Character("Morty", "Smith");
    Character scary = new Character("Scary", "Terry");
    List<Character> characters = List.of(rick, morty, scary);

    Hello hello = new Hello();
    for (Character c : characters)
      hello.sayHello(c);
  }

}

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Character rick = new Character("Rick", "Sanchez");
    Character morty = new Character("Morty", "Smith");
    Character scary = new Character("Scary", "Terry");
    List<Character> characters = List.of(rick, morty, scary);

    SimpleHello simple = new SimpleHello();
    for (Character c : characters)
      simple.sayHello(c);

    FancyHello fancy = new FancyHello();
    for (Character c : characters)
      fancy.sayHello(c);
  }

}

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Character rick = new Character("Rick", "Sanchez");
    Character morty = new Character("Morty", "Smith");
    Character scary = new Character("Scary", "Terry");
    List<Character> characters = List.of(rick, morty, scary);

    sayHelloEverybody(
        characters,
        c -> System.out.println("Hello " + c.firstName.charAt(0) + ". " + c.lastName));

    sayHelloEverybody(
        characters,
        c -> System.out.println("Hello Mr. " + c.firstName.charAt(0) + c.lastName.charAt(0)));

    sayHelloEverybody(
            characters,
            c ->  {
                System.out.println("Hello " + c.firstName);
                System.out.println("blublu");
                   });

      }


  public static void sayHelloEverybody(List<Character> characters, Helloable helloable) {
    for (Character c : characters)
      helloable.sayHello(c);
  }
}

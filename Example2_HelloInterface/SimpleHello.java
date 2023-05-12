public class SimpleHello implements Helloable {
  @Override
  public void sayHello(Character character) {
    System.out.println("Hello " + character.firstName + " " + character.lastName + "!");
  }
}

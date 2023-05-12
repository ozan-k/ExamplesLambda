public class FancyHello implements Helloable {
  @Override
  public void sayHello(Character character) {
    System.out.println("Hello Mr. " + character.lastName + ".");
  }
}

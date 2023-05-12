import java.util.*;

public class Drawing {
    public static void main(String[] args) {
        Shape rectangle = new Shape("rectangle", "123");
        Shape circle = new Shape("circle", "456");
        Shape triangle = new Shape("triangle", "789");

        List<Shape> shapes = List.of(rectangle,circle,triangle);
        shapes.forEach(x -> x.draw());
    }
}
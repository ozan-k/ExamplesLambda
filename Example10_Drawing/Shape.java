public class Shape {
    String type;
    String id;

    public Shape(String type, String id) {
        this.type = type;
        this.id = id;
    }

    void draw() {
        System.out.println("Drawing " + type + ": " + id);
    }
}
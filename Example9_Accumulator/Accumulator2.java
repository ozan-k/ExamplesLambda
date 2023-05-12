import java.util.List;

class Accumulator2 {
    int value;

    public Accumulator2(int value) {
        this.value = value;
    }

    void add(int value) {
        this.value += value;
    }

    public static void main(String[] args) {
        Accumulator2 acc = new Accumulator2(0);
        List.of(1, 2, 3, 4).forEach(x -> acc.add(x));
        System.out.println(acc.value);
    }
}
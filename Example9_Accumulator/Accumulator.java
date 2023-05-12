class Accumulator {
    int value;

    public Accumulator(int value) {
        this.value = value;
    }

    void add(int value) {
        this.value += value;
    }
}
package circus;

public class Parrot extends Bird {
    @Override
    public String speak() {
        return "Polly wants a crweweacker";
    }

    @Override
    public String toString() {
        return "I'm a parrot";
    }

    @Override
    public int getValue() {
        return 20;
    }
    ///
}

package pl.gov.coi.example;

public class Calculator {
    private final Adder adder;

    public Calculator() {
        this(new Adder());
    }

    public Calculator(Adder adder) {
        this.adder = adder;
    }

    public int add(int a, int b) {
        return adder.add(a, b);
    }

    public int sub(int a, int b) {
        return a - b;
    }

    private static final class AdderStub extends Adder {

    }
}

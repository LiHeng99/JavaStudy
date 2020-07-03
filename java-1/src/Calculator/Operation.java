package Calculator;

public abstract class Operation {
    private double NumberA;
    private double NumberB;


    public abstract double getResult();

    public Operation() {
    }

    public Operation(double numberA, double numberB) {
        NumberA = numberA;
        NumberB = numberB;
    }

    public double getNumberA() {
        return NumberA;
    }

    public void setNumberA(double numberA) {

        NumberA = numberA;
    }

    public double getNumberB() {
        return NumberB;
    }

    public void setNumberB(double numberB) {
        NumberB = numberB;
    }

}

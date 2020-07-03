package Calculator;

public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation opec = null;
        switch (operate) {
            case "+":
                opec = new OperationAdd();
                break;
            case "-":
                opec = new OperationSub();
                break;
            case "*":
                opec = new OperationMul();
                break;
            case "/":
                opec = new OperationDiv();
                break;
        }
        return opec;
    }
}

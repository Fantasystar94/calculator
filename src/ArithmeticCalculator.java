 public class ArithmeticCalculator {
    public int calculate(int value1, int value2, String c) {
        int result = 0;

        OperatorType operator = OperatorType.fromSymbol(c);
        System.out.println(operator);
        switch (operator) {
            case ADD:
            result = value1 + value2;
            break;
            case MINUS:
            result = value1-value2;
            break;
            case MULTIPLY:
            result = value1*value2;
            break;
            case DIVIDE:
            result = value1/value2;
            break;
            default:
        }
        return result;
    }

}

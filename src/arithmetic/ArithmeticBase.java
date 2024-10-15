package arithmetic;

import java.util.Scanner;

// Enum for arithmetic operations
enum Operation {
    PLUS, MINUS, TIMES, DIVIDE;
}

public class ArithmeticBase {

    public double calculate(double x, double y, Operation operation) {
        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                if (y == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return x / y;
            default:
                throw new AssertionError("Unknown operation " + operation);
        }
    }
}

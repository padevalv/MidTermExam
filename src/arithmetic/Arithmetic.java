package arithmetic;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArithmeticBase arithmeticBase = new ArithmeticBase();

        // Input numbers
        System.out.print("Enter first number: ");
        double n1 = in.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = in.nextDouble();

        // Input operation as enum
        System.out.print("Enter operation (PLUS, MINUS, TIMES, DIVIDE): ");
        String operationInput = in.next().toUpperCase();
        Operation operation;

        try {
            operation = Operation.valueOf(operationInput); // Convert String to enum
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation.");
            return;
        }

        // Perform the calculation
        double result = arithmeticBase.calculate(n1, n2, operation);

        // Print the result
        System.out.println("The result is: " + result);
    }
}

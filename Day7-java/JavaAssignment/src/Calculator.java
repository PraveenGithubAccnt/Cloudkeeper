
import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        double result = 0;
        try {
            result = a / b;
        } catch (Exception e) {
            System.out.println("Error during division: " + e.getMessage());
        }
        return result;
    }

    public void calculate(String op, double a, double b) {

        switch (op) {
            case "+":
                System.out.println("Result = " + add(a, b));
                break;

            case "-":
                System.out.println("Result = " + sub(a, b));
                break;

            case "*":
                System.out.println("Result = " + mul(a, b));
                break;

            case "/":
                System.out.println("Result = " + div(a, b));
                break;

            default:
                System.out.println("Invalid Operator!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        Calculator calc = new Calculator();
        calc.calculate(op, num1, num2);
    }
}

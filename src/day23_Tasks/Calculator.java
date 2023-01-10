package day23_Tasks;

public class Calculator {

    public static void calculator(double num1, double num2, char mathOperator) {
        if (mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/') {
            if (mathOperator == '+') {
                System.out.println(num1 + num2);
            } else if (mathOperator == '-') {
                System.out.println(num1 - num2);
            } else if (mathOperator == '*') {
                System.out.println(num1 * num2);
            } else {
                System.out.println(num1 / num2);
            }

        } else {
            System.out.println("Invalid math operator");
        }
    }
}

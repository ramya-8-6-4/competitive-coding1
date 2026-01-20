// to find all mathematitcal operations(+,-,*,/,%)

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        if (num2 != 0) {
            double quotient = num1 / num2;
            double modulo = num1 % num2;

            System.out.println("Addition: " + sum);
            System.out.println("Subtraction: " + difference);
            System.out.println("Multiplication: " + product);
            System.out.println("Division: " + quotient);
            System.out.println("Modulo Division: " + modulo);
        } else {
            System.out.println("Division: Cannot divide by zero");
            System.out.println("Modulo Division: Cannot perform modulo by zero");
        }

       }
}



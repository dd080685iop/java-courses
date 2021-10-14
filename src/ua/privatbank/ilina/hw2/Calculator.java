package ua.privatbank.ilina.hw2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int operand1, operand2;
        System.out.println("Enter operand1:");
        Scanner scanner = new Scanner(System.in);
        operand1 = scanner.nextInt();
        System.out.println("Enter operand2:");
        operand2 = scanner.nextInt();
        String symbol;
        System.out.println("Enter sign of arithmetic operation ");
        scanner.nextLine();
        symbol = scanner.nextLine();
        System.out.println("Our result is");
        switch (symbol) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Error, you cannot divide by 0");
                } else {
                    System.out.println(operand1 / operand2);
                }
                break;
            default:
                System.out.println("You entered an invalid arithmetic operation! "
                        + "Allowable values: +, -, * or /");
        }
    }
}

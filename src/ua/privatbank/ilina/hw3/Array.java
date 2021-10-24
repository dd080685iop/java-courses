package ua.privatbank.ilina.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] userArray = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 integers:");
        for (int i = 0; i <= 9; i++) {
            userArray[i] = scanner.nextInt();
        }
        System.out.println("Your array is:");
        for (int i = 0; i <= 9; i++) {
            System.out.print(userArray[i] + " ");
        }
        int sumAllElements = 0;
        for (int i = 0; i <= 9; i++) {
            sumAllElements = userArray[i] + sumAllElements;
        }
        System.out.println("\nTotal sum is: " + sumAllElements);

        int positiveElements = 0;
        for (int i = 0; i <= 9; i++) {
            if (userArray[i] > 0) {
                positiveElements++;
            }
        }
        System.out.println("Positive elements count is: " + positiveElements);

        int temp;
        for (int j = 0; j <= 9; j++) {
            for (int i = 0; i <= 8; i++) {
                if (userArray[i] > userArray[i + 1]) {
                    temp = userArray[i];
                    userArray[i] = userArray[i + 1];
                    userArray[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i <= 9; i++) {
            System.out.print(userArray[i] + " ");
        }
    }
}

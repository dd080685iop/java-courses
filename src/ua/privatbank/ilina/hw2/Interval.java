package ua.privatbank.ilina.hw2;

import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        number = scanner.nextInt();
        if (number >= 0 && number <= 14) {
            System.out.println("The entered number falls within the interval [0-14]");
        } else if (number >= 15 && number <= 35) {
            System.out.println("The entered number falls within the interval[15 - 35]");
        } else if (number >= 36 && number <= 50) {
            System.out.println("The entered number falls within the interval [36 - 50]");
        } else if (number >= 51 && number <= 100) {
            System.out.println("The entered number falls within the interval [51 - 100]");
        } else {
            System.out.println("The number entered does not fall within any of our favorite ranges (");
        }

    }
}
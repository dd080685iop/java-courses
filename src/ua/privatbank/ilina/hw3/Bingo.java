package ua.privatbank.ilina.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * (100 - 0 + 1) + 0);
        System.out.println("Please guess the random number from 0 to 100. Type 111 for exit:");
        Scanner scanner = new Scanner(System.in);
        int attempts = 1;
        do {
            int userNumber = scanner.nextInt();
            if (userNumber == 111) {
                System.out.println("Bye-bye");
                System.exit(0);
            }
            if (userNumber == randomNumber) {
                System.out.println("Congratulation! You have guessed the random number!");
                System.out.println("You have used " + attempts + " attempts");
                System.exit(0);
            } else {
                attempts++;
                if (randomNumber > userNumber) {
                    System.out.println("Random number is more then your");
                } else {
                    System.out.println("Random number is less then your");
                }
            }
        } while (true);
    }
}

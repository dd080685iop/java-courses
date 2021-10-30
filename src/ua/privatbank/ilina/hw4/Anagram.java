package ua.privatbank.ilina.hw4;

import java.util.Scanner;

public class Anagram {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string #1:");
        String userStr1 = scanner.nextLine();
        System.out.println("Please enter string #2:");
        String userStr2 = scanner.nextLine();
        String ignoredSymbols = " ;:.,!?-";
        for (int i = 0; i < userStr1.length(); i++) {
            char ch = userStr1.charAt(i);
            if (ignoredSymbols.indexOf(ch) >= 0) {
                continue;
            }
            if (userStr2.indexOf(ch) == -1) {
                System.out.println("These strings are not Anagram");
                System.exit(0);
            } else {
                userStr2 = deleteFirstSymbolOccurrenceFromString(userStr2, ch);
            }
        }
        if (userStr2.isEmpty()) {
            System.out.println("Anagram!!!");
        } else {
            System.out.println("Not anagram...");
        }
    }

    private static String deleteFirstSymbolOccurrenceFromString(String string,
                                                                char charToDelete) {
        int charIndexForDelete = string.indexOf(charToDelete);
        if (charIndexForDelete == -1) {
            return string;
        } else {
            return string.substring(0, charIndexForDelete) +
                    string.substring(charIndexForDelete + 1);
        }
    }
}

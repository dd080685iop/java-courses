package ua.privatbank.ilina.hw4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CapitalLetter {
    //    1. Создайте класс CapitalLetter в пакете hw4.
//    Напишите программу, которая принимает строку и переводит первую букву слова в верхний регистр.
//    Строку должен ввести пользователь.
    public static void main(String[] args) {
        String usersStr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string:");
        usersStr = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(usersStr);
        StringBuilder sb = new StringBuilder();
        do {
            String token = tokenizer.nextToken();
            String tokenWithFirstCapitalLetter = makeFirstLetterCapital(token);
            sb.append(tokenWithFirstCapitalLetter + " ");
        }
        while (tokenizer.hasMoreElements());
        System.out.println(sb);
    }

    private static String makeFirstLetterCapital(String token) {
        Character firstLetter = Character.toUpperCase(token.charAt(0));
        return firstLetter + token.substring(1);
    }
//    Пример работы:
//    Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
//    Истина — Это То, Что Выдерживает Проверку Опытом. Эйнштейн А.
//    При выполнении задания использовать метод(ы).
}

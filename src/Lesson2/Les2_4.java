package Lesson2;

import java.util.Scanner;

public class Les2_4 {

    static int sumOfThreeNumbers(int a, int b, int c) {
        int d = a + b + c;
        byte f = (byte) d;
        return f;
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Введіть число:");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number > 0: " + true);
        } else {
            System.out.println("Number < 0: " + false);
        }

        sumOfTwoWords("Hello", "World");
        System.out.println(sumOfThreeNumbers(1, 2, 3));
    }

    public static void sumOfTwoWords(String word1, String word2) {
        int totalLength = word1.length() + word2.length();
        System.out.println(word1 + " " + word2 + " " + totalLength);
    }
}
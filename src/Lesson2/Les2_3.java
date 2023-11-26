package Lesson2;

import java.util.Scanner;

public class Les2_3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Введіть число:");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number > 0: " + true);
        } else {
            System.out.println("Number < 0: " + false);
        }
    }
}


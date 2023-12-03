package Lesson6;

import java.util.Arrays;

public class Les6_1 {
    public static void main(String[] args) {
        int[] array = {5, 11, 7, 20};

        Arrays.sort(array); //5,7,11,20
        int minDifference = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int difference = Math.abs(array[i] - array[i + 1]);
            if (minDifference == 0 || difference < minDifference) {
                minDifference = difference;
            }
        }
        System.out.println("Найменше значення різниці за модулем: " + minDifference);
    }
}



package Lesson7;

public class Les7_1 {
    public static void arrayDivision(int[] array, int divisor) {
        if (divisor == 0) {
            System.out.println(" Error : Unable to divide by zero.");
            return;
        }

        double[] arrayDivision = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayDivision[i] = (double) array[i] / divisor;
        }

        System.out.println(" New element array with split elements: ");
        for (double element : arrayDivision) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15};
        int divisor = 2;

        arrayDivision(numbers, divisor);
    }
}


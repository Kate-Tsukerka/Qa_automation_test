package Lesson3;

public class Les3_4 {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if (i > 0) {
                for (int k = 6; k > i; k--) {
                    System.out.print(" ");
                }
            for (int j = i; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

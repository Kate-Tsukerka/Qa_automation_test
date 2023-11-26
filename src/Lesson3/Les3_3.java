package Lesson3;

public class Les3_3 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i > 0) {
                for (int k = 0; k < i; k++) {
                    System.out.print(" ");
                }
            }
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



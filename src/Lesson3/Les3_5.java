package Lesson3;

public class Les3_5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 0; k < 4; k++) {
            for (int v = k; v < 4 ; v++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


package Lesson2;

public class Les2_2 {

    void showText(String word, int number) {
        String word1 = "Hello";
        String word2 = "World";
        sumOfTwoWords(word1, word2);
    }

    static int sumOfThreeNumbers(int a, int b, int c) {
        int d = a + b + c;
        byte f = (byte) d;
        return f;
    }

    public static void sumOfTwoWords(String word1, String word2) {
        int totalLength = word1.length() + word2.length();
        System.out.println(word1 + " " + word2 + " " + totalLength);
    }

    public static void main(String[] args) {
        sumOfTwoWords("Hello", "World");
        System.out.println(sumOfThreeNumbers(1, 2, 3));
    }
}


package Lesson3;

public class Les3_1 {

    public static void main(String[] args) {
        String word1 = "HELLO";
        int len1 = word1.length();
        String word2 = "MY";
        int len2 = word2.length();
        String word3 = "FRIENDS";
        int len3 = word3.length();
        lengthWords(word1, len1, word2, len2, word3, len3);
    }

    public static void lengthWords(String word1, int len1, String word2, int len2, String word3, int len3) {
        if (len1 > len2 && len1 > len3) {
            System.out.println(word1);
        } else if (len2 > len1 && len2 > len3) {
            System.out.println(word2);
        } else if (len3 > len2 && len3 > len1) {
            System.out.println(word3);
        } else {
            System.out.println("Words have the same length.");
        }
    }
}
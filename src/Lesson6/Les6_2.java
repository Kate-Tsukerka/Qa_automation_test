package Lesson6;

import java.util.*;

public class Les6_2 {
    public static void main(String[] args) {
        List<String> books = Arrays.asList("Book 1", "Book 2", "Book 3", "Book 4", "Book 5");
        Map<Integer, String> bookMap = convertListToMap(books);

        // Вивід мапи книг
        for (Map.Entry<Integer, String> entry : bookMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    public static Map<Integer, String> convertListToMap(List<String> bookList) {
        Map<Integer, String> bookMap = new HashMap<>();

        for (int i = 0; i < bookList.size(); i++) {
            bookMap.put(i, bookList.get(i));
        }

        return bookMap;
    }
}


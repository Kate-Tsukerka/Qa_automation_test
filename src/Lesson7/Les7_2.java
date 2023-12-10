package Lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les7_2 {
    public static void main(String[] args) {
        List<String> phoneNumber = new ArrayList<>();
        phoneNumber.add("+380638796232");
        phoneNumber.add("+480934531278");
        phoneNumber.add("+380671234564");
        phoneNumber.add("+0578743552");

        String regex = "^\\+380\\d{3}\\d{2}\\d{2}\\d{2}$";

        Pattern pattern = Pattern.compile(regex);

        for (String number : phoneNumber) {
            Matcher matcher = pattern.matcher(number);
            System.out.println(number + " : " + matcher.matches());
        }
    }
}

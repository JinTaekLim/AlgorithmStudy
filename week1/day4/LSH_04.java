package week1.day4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LSH_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        List<String> newStr = new ArrayList<>();

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                newStr.add(String.valueOf(Character.toUpperCase(ch)));
            } else {
                newStr.add(String.valueOf(Character.toLowerCase(ch)));
            }
        }

        String result = String.join("", newStr);
        System.out.println(result);
    }
}

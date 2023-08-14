package week10.day3;


public class SJG_03 {
    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            int start = parts[i][0];
            int end = parts[i][1];

            String substring = my_strings[i].substring(start, end + 1);
            result.append(substring);
        }

        return result.toString();
    }
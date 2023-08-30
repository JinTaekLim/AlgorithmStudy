package week013.day1;

public class LJH_01 {
    class Solution {
        public String solution(String my_string, int m, int c) {
            String answer = "";

            for (int i = 0; i < my_string.length(); i += m) {
                String cut = my_string.substring(i, i + m);

                answer += cut.charAt(c - 1);
            }
            return answer;
        }
    }
}
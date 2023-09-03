package week013.day1;



public class LJH_01 {
    class Solution {
        public String solution(String my_string, int m, int c) {
            String answer = "";

            for (int i = 0; i < my_string.length(); i += m) {
                String cut = my_string.substring(i, i + m); // 0번째 인덱스부터 m개씩 자른 값을 cut에 저장

                answer += cut.charAt(c - 1); // c-1 인덱스 즉 c번째 열에 적힌 문자를 answer값에 저장
            }
            return answer;
        }
    }
}
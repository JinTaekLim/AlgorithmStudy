package week012.day3;

/*
섹션을 3개로 나눠서 자르고 붙이기
1.0부터 s까지 자르기
2.s부터 e + 1까지 자르기
3.e + 1부터 my_string.length()까지 자르기

이후 2를 뒤집기(2')
= 1 + 2' + 3
 */

public class LJH_03 {
    class Solution {
        public String solution(String my_string, int s, int e) {
            String answer = "";
            String rev = "";
            String sec1 = "";
            String sec2 = "";
            String sec3 = "";

            sec1 = my_string.substring(0, s);
            sec2 = my_string.substring(s, e + 1);
            sec3 = my_string.substring(e + 1, my_string.length());

            for (int i = sec2.length() - 1; i >= 0; i--) {
                rev += sec2.charAt(i);
            }
            answer = sec1 + rev + sec3;
            return answer;
        }
    }
}

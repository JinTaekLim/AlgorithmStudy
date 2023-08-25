package week012.day1;
/*
my_string을 n번째 까지 자르고 answer에 넣고 answer 반환
 */
public class LJH_01 {
    class Solution {
        public String solution(String my_string, int n) {
            String answer = "";
            answer = my_string.substring(0, n);
            return answer;
        }
    }
}

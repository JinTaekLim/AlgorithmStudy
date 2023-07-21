package week9.day3;

public class LJH_03 {
    class Solution {
        public int solution(String number) {
            int answer = 0;
            for(int i = 0; i < number.length(); i++){
                answer += number.charAt(i) - '0';
                System.out.println(answer);
            }
            answer %= 9;
            return answer;
        }
    }
}

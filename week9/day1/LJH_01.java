package week9.day1;

public class LJH_01 {
    class Solution {
        public int solution(int a, int b, int c, int d) {
            int answer = 0;
            if(a == b && b == c && c == d) {
                answer = a * 1111;
            } else if (a == b && b == c) { // 주사위 3개가 같을 경우

            } else if (b == c && c == d) { // 주사위 3개가 같을 경우

            } else if (c == d && d == a) { // 주사위 3개가 같을 경우

            } else if (d == a && a == b) { // 주사위 3개가 같을 경우
                
            } else if (a == b) { // 주사위 2개가 같을 경우
                
            } else if (b == c) { // 주사위 2개가 같을 경우
                
            } else if (c == d) { // 주사위 2개가 같을 경우
                
            } else if (d == a) { // 주사위 2개가 같을 경우
                
            }
            return answer;
    }
}

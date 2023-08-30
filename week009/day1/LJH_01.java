package week009.day1;

public class LJH_01 {
    class Solution {
        public int solution(int a, int b, int c, int d) {
            int answer = 0;
            if (a == b && b == c && c == d) { // 주사위가 모두 같을 경우
                answer = a * 1111;
            } else if (a == b && b == c) { // 주사위 3개가 같을 경우
                answer = (10*a+b)*(10*a+b);
            } else if (b == c && c == d) { // 주사위 3개가 같을 경우
                answer = (10*a+b)*(10*a+b);
            } else if (c == d && d == a) { // 주사위 3개가 같을 경우
                answer = (10*a+b)*(10*a+b);
            } else if (d == a && a == b) { // 주사위 3개가 같을 경우
                answer = (10*a+b)*(10*a+b);
            } else if (a == b && c == d) { // 주사위 2개씩 같을 경우
                answer = (a + c) * Math.abs(a - c);
            } else if (a == c && b == d) { // 주사위 2개씩 같을 경우
                answer = (a + b * Math.abs(a - b);
            } else if (a == d && c == b) { // 주사위 2개씩 같을 경우
                answer = (a + c) * Math.abs(a - c);
            } else if ( a == b && a!=c && a!=d && c!=d){ // 주사위 2개는 같고 2개는 다를때
                answer = c * d;
            } else if (a == c && a!=b && a!=d && b!=d) { // 주사위 2개는 같고 2개는 다를때
                answer = c * d;
            } else if (a == d && a != b &&) { // 주사위 2개는 같고 2개는 다를때
                answer = c * d;
            } else if (b == c) { // 주사위 2개는 같고 2개는 다를때
                answer = c * d;
            } else if (b == d) { // 주사위 2개는 같고 2개는 다를때
                answer = c * d;
            } else if (c == d) { // 주사위 2개는 같고 2개는 다를때
                answer = c * d;
            }
            return answer;
        }
    }
}
package week3.day5;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String num1 = Integer.toString(a);
        String num2 = Integer.toString(b);
        String result1 = num1 + num2;
        int result2 = 2 * a * b;


        if(Integer.valueOf(result1) > result2 || result1.equals(result2) ) answer = Integer.valueOf(result1);
        if(Integer.valueOf(result1) < result2) answer = result2;

        return answer;
    }
}

// 12번째 줄에서 논리 연산자를 사용하기 보다는 >=와 같은 비교 연산자를 사용하면 더 깔끔할 수 있지 않을까요!?




/*

public class LJT_05 {
    public static void main(String[] args) {
        Solution p = new Solution();
        System.out.print(p.solution(22,21));

    }
}


 */
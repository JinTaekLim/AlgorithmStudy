package week4.day5;

class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;

        double result1 = a-b;
        double result2 = a+b;


        if(flag) answer = (int)Math.round(result2);
        else answer = (int)Math.round(result1);


        return answer;
    }
}





/*

public class LJT_05 {
    public static void main(String[] args) {


        Solution p = new Solution();
        System.out.print(p.solution(-4,7,false));
    }
}


 */
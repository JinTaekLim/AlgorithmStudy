package week4.day2;

class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;

        if(number < 10 && number > 100 &&  n < 2 && m < 2 && n > 9 && m > 9) return answer=2;
        if(number%n == 0 && number%m ==0) answer = 1;
        else answer = 0;

        return answer;
    }
}




/*
public class LJT_02 {
    public static void main(String[] args) {
        Solution p = new Solution();
        System.out.print(p.solution(60,2,3));


    }
}

 */
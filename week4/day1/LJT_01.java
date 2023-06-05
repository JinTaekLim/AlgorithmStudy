package week4.day1;

class Solution {
    public int solution(int num, int n) {
        int answer = 0;

        if(num<2 && num > 100 && n<2 && n>9) return 2;

        if(num%n == 0) answer = 1;


        return answer;
    }
}


/*
public class LJT_01 {
    public static void main(String[] args) {
        Solution p = new Solution();
        System.out.print(p.solution(22,2));


    }
}

 */
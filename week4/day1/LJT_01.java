package week4.day1;

class Solution {
    public int solution(int num, int n) {
        int answer = 0;

        if(num<2 && num > 100 && n<2 && n>9) return 2;

        if(num%n == 0) answer = 1;


        return answer;
    }
}

//  조건에 맞지 않는 경우 2로 반환하는 아이디어 좋은 것 같습니다.

/*
public class LJT_01 {
    public static void main(String[] args) {
        Solution p = new Solution();
        System.out.print(p.solution(22,2));


    }
}

 */
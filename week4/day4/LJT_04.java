package week4.day4;


class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if(eq.equals("!")){
            if(ineq.equals("<")){
                if(n<m) answer = 1;
                else answer = 0;
            }
            if(ineq.equals(">")){
                if(n>m) answer = 1;
                else answer = 0;
            }
        }


        if(eq.equals("=")){
            if(ineq.equals("<")){
                if(n<=m) answer = 1;
                else answer = 0;
            }
            if(ineq.equals(">")){
                if(n>=m) answer = 1;
                else answer = 0;
            }
        }

        return answer;
    }
}

public class LJT_04 {
    public static void main(String[] args) {
        Solution p = new Solution();
        System.out.print(p.solution("<","=",50,50));


    }
}
package week4.day3;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int A = 0;
        int B = 0;

        for(int i=1; i<n+1; i++){
            if(i%2 == 0) A = A + i*i;
            if(i%2 == 1) B += i;
        }

        if(n%2 == 0) answer = A;
        if(n%2 == 1) answer = B;
        return answer;
    }
}

//변수명은 소문자로 작성하는 것이 좋을 것 같아요!

/*
public class LJT_03 {
    public static void main(String[] args) {
        Solution p = new Solution();
        System.out.print(p.solution(10));


    }
}

 */
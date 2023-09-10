import java.util.*;

class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start-end_num+1];

        for(int i=start,j=0;i>=end_num;i--,j++){
            answer[j] = i;
        }
        return answer;
    }
}

public class Main {

    public static void main(String[] args) {

        Solution p = new Solution();


        int[] a = {1,16,6,15,0,10,11,3};

        //System.out.println("\n"+p.solution(10,3));

        //System.out.println(p.solution(1 ,0,"programmers").toString());

        System.out.println(Arrays.toString(p.solution(10,3)));

    }
    }
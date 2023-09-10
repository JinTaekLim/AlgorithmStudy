import java.util.*;

class Solution {
    public int[] solution(int n, int k) {

        int[] answer = new int[n/k];


        for(int i=1,j =0; i<=n; i++){
            if(i%k==0){
                answer[j] = i;
                j++;
            }
        }

        Arrays.sort(answer);


        return answer;
    }
}

public class Main {

    public static void main(String[] args) {

        Solution p = new Solution();


        //System.out.println("\n"+p.solution(10,3));

        //System.out.println(p.solution(1 ,0,"programmers").toString());

        System.out.println(Arrays.toString(p.solution(10,3)));

    }
    }
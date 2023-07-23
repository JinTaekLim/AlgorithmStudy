package week10.day2;

import java.util.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";


        for(int i=0;i<index_list.length;i++){
            //System.out.println(my_string.charAt(index_list[i])+"추가");
            answer += my_string.charAt(index_list[i]);
            //System.out.println(answer);
        }


        //System.out.println(answer);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

        Solution p = new Solution();


        int num[] = {16,6,5,3,12,14,11,11,17,12,7};

        System.out.println(p.solution("cvsgiorszzzmrpaqpe",num));

        //System.out.println(Arrays.toString(p.solution(2,2,2,2)));
        }
    }
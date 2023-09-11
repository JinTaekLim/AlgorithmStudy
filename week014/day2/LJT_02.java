package week014.day2;

import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";


        StringBuilder sb = new StringBuilder(my_string);

        for(int i=0; i<indices.length; i++){
            sb.setCharAt(indices[i],' ');
        }

        answer = sb.toString().replaceAll(" ","");

        return answer;
    }
}

public class Main {

    public static void main(String[] args) {

        Solution p = new Solution();


        int[] a = {1,16,6,15,0,10,11,3};

        System.out.println("\n"+p.solution("apporoograpemmemprs",a));

        //System.out.println(p.solution(1 ,0,"programmers").toString());

        //System.out.println(Arrays.toString(p.solution("apporoograpemmemprs",a)));

    }
    }
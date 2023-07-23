package week10.day3;

import java.util.*;

class Solution {
    public int solution(String number) {
        int answer = 0;
        //int num = Integer.parseInt(number);
        int a = 0;
        for(int i=0; i<number.length(); i++){
            a += Character.getNumericValue(number.charAt(i));
        }

        answer = a%9;


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

        Solution p = new Solution();


        int num[] = {16,6,5,3,12,14,11,11,17,12,7};

        System.out.println(p.solution("123"));

        //System.out.println(Arrays.toString(p.solution(2,2,2,2)));
        }
    }
import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        int indx = 0;

        for (char i = 'A'; i <= 'Z'; i++,indx++) {
            int num = 0;
            for (int j = 0; j < my_string.length(); j++) {
                if(my_string.charAt(j) == i) num ++;
                answer[indx] = num;
            }
        }


        for (char i = 'a'; i <= 'z'; i++,indx++) {
            int num = 0;
            for (int j = 0; j < my_string.length(); j++) {
                if (my_string.charAt(j) == i) num++;
                answer[indx] = num;
            }
        }





        /*
        for(char k = 'a';k<='z';k++){
            System.out.print(k);
        }
         */

        return answer;
    }
}

public class Main {

    public static void main(String[] args) {

        Solution p = new Solution();


        //System.out.println("\n"+p.solution("Programmers"));

        //System.out.println(p.solution(1 ,0,"programmers").toString());

        System.out.println(Arrays.toString(p.solution("Programmers")));

    }
    }
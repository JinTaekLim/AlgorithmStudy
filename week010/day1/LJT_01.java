import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String reverse = "";


/*
        reverse = my_string.substring(2,4);
        StringBuffer re = new StringBuffer(reverse);
        StringBuffer an = new StringBuffer(my_string);
        an.replace(2,4, String.valueOf(re.reverse()));
        System.out.println(an);


 */




       for(int i=0; i<queries.length; i++){
           //System.out.println("q[i][1] = "+queries[i][1]+"   q[i][0] = "+queries[i][0]);

           StringBuffer an = new StringBuffer(my_string);
           reverse = my_string.substring(queries[i][0],queries[i][1]+1);
           StringBuffer re = new StringBuffer(reverse);
           an.replace(queries[i][0],queries[i][1]+1, String.valueOf(re.reverse()));
           //System.out.print(re+"   ");
           //System.out.println(an);
           my_string = String.valueOf(an);

       }


       answer = my_string;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

        Solution p = new Solution();


        int num[][] = {{2,3},{0,7},{5,9},{6,10}};

        System.out.println(p.solution("rermgorpsam",num));

        //System.out.println(Arrays.toString(p.solution(2,2,2,2)));
        }
    }
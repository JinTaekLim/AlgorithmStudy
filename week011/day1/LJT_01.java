import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        for(int i=1; i<n+1; i++){
            answer += my_string.charAt(my_string.length()-i);
        }

        StringBuffer sb = new StringBuffer(answer);
        answer = sb.reverse().toString();


        return answer;
    }
}
public class Main {

    public static void main(String[] args) {

        Solution p = new Solution();


        System.out.println(p.solution("ProgrammerS123",11));

        //System.out.println(Arrays.toString(p.solution(str,i)));

        //System.out.println(p.solution(str,50000,5,5).toString());

    }
    }
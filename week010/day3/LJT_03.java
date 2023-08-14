import java.util.*;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for(int i=0; i<my_strings.length; i++){
            answer += my_strings[i].substring(parts[i][0],parts[i][1]+1);

        }
        return answer;
    }
}
public class Main {
    public static void main(String[] args) {

        Solution p = new Solution();


        String str[] = {"progressive","hamburger","hammer","ahocorasick"};
        int i[][] = {{0,4},{1,2},{3,5},{7,7}};


        System.out.println(p.solution(str,i));

        //System.out.println(Arrays.toString(p.solution(str,i)));

        //System.out.println(p.solution(str,50000,5,5).toString());

    }
    }
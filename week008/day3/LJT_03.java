import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;

        boolean a = true;
        boolean b = true;

        if(x1 == false && x2 == false) a = false;
        if(x3 == false && x4 == false) b = false;

        if(a == false || b == false){
            answer = false;
        }
        

        return answer;
    }
}

public class test {
    public static void main(String[] args) {
        Solution p = new Solution();



        System.out.println(p.solution(false,false,true,true));

        //System.out.println(Arrays.toString(p.solution(false,true,true,true,true)));


    }
}


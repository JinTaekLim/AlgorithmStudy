import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        List<Integer>  list = new ArrayList<>();

        while(n != 1){
            list.add(n);
            if(n%2 == 0){
                n = n/2;
            }
            else if(n%2 == 1){
                n = n * 3 + 1;
            }
        }
        if(n == 1){
            list.add(n);
        }
        //System.out.println(list.toString());
        int[] answer = new int[list.size()];

        for (int i = 0 ; i < list.size() ; i++) {
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}

public class test {
    public static void main(String[] args) {
        Solution p = new Solution();



        //System.out.println(p.solution(10));

        System.out.println(Arrays.toString(p.solution(10)));


    }
}


import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        String str = "";

        for(int i=0;i<intStrs.length;i++){
            str = intStrs[i].substring(s,s+l);

            if(Integer.parseInt(str)>k){
                list.add(Integer.parseInt(str));
            }
        }

        System.out.println(list.toString());

        answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
public class Main {
    public static void main(String[] args) {

        Solution p = new Solution();


        String str[] = {"0123456789","9876543210","9999999999999"};

        System.out.println(Arrays.toString(p.solution(str,50000,5,5)));

        //System.out.println(p.solution(str,50000,5,5).toString());

    }
    }
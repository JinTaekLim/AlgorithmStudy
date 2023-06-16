import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        // System.out.println(Arrays.toString(players));

        for(int i=0;i<callings.length;i++){
            for(int j=0;j<players.length;j++){
                if(players[j] == callings[i]){
                    // System.out.println("i = "+i+" j= "+j);
                    // Collections.swap(Arrays.asList(players), j, j-1);
                    String tmp = players[j];
                    players[j] = players[j-1];
                    players[j-1] = tmp;
                }
            }
            System.out.println(Arrays.toString(players));
        }
        String[] result = {};
        result = players;
        answer = result;

        return answer;
    }
}



public class test {
    public static void main(String[] args) {
        Solution p = new Solution();

        String[] a = {"mumu", "soe", "poe", "kai", "mine"};
        String[] b = {"kai", "kai", "mine", "mine"};


        System.out.println(" result = "+Arrays.toString(p.solution(a,b)));


    }
}
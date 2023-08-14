package week005.day5;

import java.util.Arrays;

public class LSH_05 {
    public String[] solution(String[] players, String[] callings) {
        Integer[] playersCnt = new Integer[players.length];
        Arrays.fill(playersCnt, 0);

        for(int i = 0; i < callings.length; i++){
            for(int j = 0; j < players.length; j++){
                if(callings[i].equals(players[j])){
                    playersCnt[j] += 1;
                }
            }
        }










        String[] answer = {};
        return answer;
    }
}

package week5.day5;

public class HYB_05 {
  public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        String temp="";
        Map<String, Integer> playersMap = new HashMap<>();
        
        for(int i=0; i<players.length; i++)
            playersMap.put(players[i], i+1);
        
        for(int i=0; i<callings.length; i++) {
			 temp = players[playersMap.get(callings[i])-2];
			 players[playersMap.get(callings[i])-2] = players[playersMap.get(callings[i])-1];
			 players[playersMap.get(callings[i])-1] = temp;
			 
			 playersMap.put(callings[i], playersMap.get(callings[i])-1);
			 playersMap.put(temp, playersMap.get(temp)+1);
			 
		}
        
        return players;
    }

}

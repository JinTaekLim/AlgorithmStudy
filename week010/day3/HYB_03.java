package week010.day3;

public class HYB_03 {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int i=0;

        for(String str : my_strings){
            answer+=str.substring(parts[i][0],parts[i][1]+1);
            i++;

        }

        return answer;
    }

}

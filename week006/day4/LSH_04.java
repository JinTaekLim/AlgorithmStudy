package week006.day4;

public class LSH_04 {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        for(int i : numLog){
            if(1 == numLog[i+1] - numLog[i]){
                answer.append("w");
            }
            else if (-1 == numLog[i+1] - numLog[i]){
                answer.append("s");
            }
            else if (10 == numLog[i+1] - numLog[i]){
                answer.append("d");
            }
            else if (-10 == numLog[i+1] - numLog[i]){
                answer.append("a");
            }
        }
        return answer.toString();
    }
}

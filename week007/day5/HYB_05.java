package week007.day5;

public class HYB_05 {
    public int[] solution(int start, int end) {
        int len=end-start+1;
        int[] answer = new int[len];

        for(int i=0; i<len; i++){
            answer[i]=start;
            start++;
        }

        return answer;
    }
}

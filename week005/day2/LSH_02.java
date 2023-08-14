package week005.day2;

public class LSH_02 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i =0; i< included.length; i++){
            if (included[i]){
                answer += a + (d * i);
            }
        }
        return answer;
    }
}

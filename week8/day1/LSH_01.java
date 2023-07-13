package week8.day1;
import java.util.ArrayList;

public class LSH_01 {
    public int[] solution(int n) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(n);
        while(n!=1){
            if(n%2==0){
                n /= 2;
                numList.add(n);
            } else{
                n = 3 * n + 1;
                numList.add(n);
            }
        }
        int[] answer = numList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}

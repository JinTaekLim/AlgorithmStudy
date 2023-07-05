import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int start, int end) {
        int[] answer = {};
        List<Integer> list = new ArrayList();

        for(int i=start;i<=end;i++){
            System.out.println(i);
            list.add(i);
        }


        int[] arr = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++)
            arr[i] = list.get(i).intValue();


        answer = arr;
        return answer;
    }
}

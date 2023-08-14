package week008.day2;

import java.util.ArrayList;
import java.util.List;

public class LSH_02 {
    public List<Integer> solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
            } else if (stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
            } else if (stk.get(stk.size() - 1) >= arr[i]) {
                stk.remove(stk.size() - 1);
                i--;
            }
        }
        return stk;
    }

}

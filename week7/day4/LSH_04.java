package week7.day4;
import java.util.ArrayList;
import java.util.List;

public class LSH_04 {
    public int[] solution(int l, int r) {
        List<Integer> findInt = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (isContainsOnly05(i)) {
                findInt.add(i);
            }
        }
        if (findInt.isEmpty()) {
            return new int[]{-1};
        }else {
            int[] result = new int[findInt.size()];
            for (int i = 0; i < findInt.size(); i++) {
                result[i] = findInt.get(i);
            }
            return result;
        }

    }

    private boolean isContainsOnly05(int num) {
        String numStr = String.valueOf(num);
        for (char c : numStr.toCharArray()) {
            if (c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }
}

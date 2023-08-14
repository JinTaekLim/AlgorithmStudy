package week008.day1;
import java.util.ArrayList;

class LJH_01 {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> array = new ArrayList<>();
        array.add(n);
        while (n != 1) {
            if(n % 2 == 0){
                n /= 2;
            } else if (n % 2 != 0) {
                n = 3 * n + 1;
            }
            array.add(n);
        }
        int[] result = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            result[i] = array.get(i);
        }
        return answer;
    }
}
package week4.day3;

import java.util.ArrayList;
import java.util.List;

public class LSH_03 {
    public int solution(int n) {

        List<Integer> intList = findIntList(n);
        int result = 0;

        if(n%2 == 0) {
            for(int num : intList){
                result += Math.pow(num, 2);
            }
        } else {
            for(int num : intList){
                result += num;
            }
        }
        return result;
    }

    public List<Integer> findIntList(int n) {
        List<Integer> intList = new ArrayList<>();
        for(int i = n; i >= 0; i -= 2){
            intList.add(i);
        }
        return intList;
    }
}
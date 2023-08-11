package week10.day2;

import java.util.ArrayList;

public class LSH_02 {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i< intStrs.length; i++){
            String a = intStrs[i].substring(s,s+l);
            if(Integer.parseInt(a) > k){
                result.add(Integer.parseInt(a));
            }
        }
        return result;
    }
}

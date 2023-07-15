package week8.day2;

import java.util.ArrayList;
import java.util.List;

public class HYB_02 {
    public List solution(int[] arr) {
        int cnt=0;

        List stk = new ArrayList();

        for(int j=0; j<arr.length; ){
            if(stk.size()==0){
                stk.add(arr[j]);
                j++;
                cnt++;
            }
            else{
                if((int)stk.get(cnt-1)<arr[j]){
                    stk.add(arr[j]);
                    j++;
                    cnt++;
                }
                else{
                    stk.remove(cnt-1);
                    cnt--;
                }
            }
        }
        return stk;
    }
}




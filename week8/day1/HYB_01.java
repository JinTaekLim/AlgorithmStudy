package week8.day1;

import java.util.ArrayList;
import java.util.List;

public class HYB_01 {
    public List solution(int n) {
        int[] answer = {};
        List result= new ArrayList();

        result.add(n);
        while(n!=1){
            if(n%2==0){
                n/=2;
                result.add(n);
            }
            else{
                n=3*n+1;
                result.add(n);
            }
        }


        return result;
    }
}

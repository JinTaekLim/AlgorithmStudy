package week010.day2;

import java.util.ArrayList;
import java.util.List;

public class HYB_02 {
    public List solution(String[] intStrs, int k, int s, int l) {
        int num=0;
        int cnt=0;
        List answer = new ArrayList();

        for(String str : intStrs){
            num=Integer.parseInt(str.substring(s,s+l));
            if(num>k)
                answer.add(num);
            else
                cnt++;
        }



        return answer;
    }
}

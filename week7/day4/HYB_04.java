package week7.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HYB_04 {
    public List<Integer> solution(int l, int r) {
        int[] answer = {};
        String tmp="";
        String[] result={};
        int flag=0;
        int cnt=0;

        List<String> newList= new ArrayList<>(Arrays.asList(result));

        for(int i=l; i<r+1; i++){
            flag=0;
            if(i%5==0){
                tmp=Integer.toString(i);

                for(int j=0; j<tmp.length(); j++){

                    if(tmp.charAt(j)=='5'||tmp.charAt(j)=='0')
                        flag=0;
                    else{
                        flag=-1;
                        break;
                    }

                }
                if(flag==0){
                    newList.add(tmp);
                    cnt++;
                }

            }

        }
        if(cnt==0){
            newList.add("-1");
        }
        System.out.print(newList);

        List<Integer> newList2 = new ArrayList<>();
        for (String s : newList) {
            newList2.add(Integer.parseInt(s));
        }

        return newList2;
    }
}

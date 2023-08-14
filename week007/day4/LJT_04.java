import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};


        ArrayList<Integer> list = new ArrayList<>();

        for(int i=l;i<=r;i++){
            boolean a = true;
            String str1 = Integer.toString(i);

            for(int j=0;j<str1.length();j++){
                //System.out.println(str1.charAt(j));

                if(str1.charAt(j) != '5' && str1.charAt(j) != '0' ){
                    a = false;
                }
            }
            if(a==true){
                System.out.println(i);
                list.add(i);
            }
        }
        if(list.size()==0){
            list.add(-1);
        }

        System.out.println(list);



        int[] arr = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++) {
            arr[i] = list.get(i).intValue();
        }

        answer = arr;


        return answer;
    }
}



import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length;){
            if(list.size() == 0){
                list.add(arr[i]);
                i += 1;
            }
            else if(list.size() > 0 && list.get(list.size()-1) < arr[i]){
                list.add(arr[i]);
                i+= 1;
            }
            else if(list.size() > 0 && list.get(list.size()-1) >= arr[i]){
                list.remove(list.size()-1);

            }
        }

        int[] stk = new int[list.size()];

        for (int i = 0 ; i < list.size() ; i++) {
            stk[i] = list.get(i).intValue();
        }

        System.out.println(list.toString());


        return stk;
    }
}


public class test {
    public static void main(String[] args) {
        Solution p = new Solution();

        int arr[] = {1,4,2,5,3};


        //System.out.println(p.solution(10));

        System.out.println(Arrays.toString(p.solution(arr)));


    }
}


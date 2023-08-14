import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int i=0;i<queries.length;i++){
            //System.out.println("arr[] : " + Arrays.toString(arr));
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            System.out.println("\ni=" + i + " s=" + s + " e=" + e + " k=" + k);



            int[] sort = Arrays.copyOf(arr, e+1);
            Arrays.sort(sort);
            //System.out.println("arr[] : " + Arrays.toString(sort));

            for(int j=s;j<=e;j++){
                System.out.print(sort[j]+ " ");

                if(k<sort[j] && sort[j] != -1){
                    System.out.println("ㅁ");
                    answer[i] = sort[j];
                    break;
                }
                else{
                    answer[i] = -1;
                }
            }


        }


        return answer;
    }
}

public class test {
    public static void main(String[] args) {
        Solution p = new Solution();


        int arr[] = {0, 1, 2, 4, 3};
        int photo[][] = { {2,4,2},{0,3,2},{0,2,2} };

        //System.out.println(p.solution(arr,photo));

        System.out.println(Arrays.toString(p.solution(arr,photo)));


    }
}


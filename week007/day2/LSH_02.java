package week007.day2;
import java.util.Arrays;

public class LSH_02 {
    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] result = new int[queries.length];

            for (int i = 0; i < queries.length; i++) {

                int s = queries[i][0];
                int e = queries[i][1];
                int k = queries[i][2];

                int[] subArr = Arrays.copyOfRange(arr, s, e + 1);

                int temp = -1;

                for (int j = 0; j < subArr.length; j++) {
                    if (subArr[j] > k) {
                        temp = subArr[j];
                        break;
                    }
                }
                result[i] = temp;
            }

            return result;
        }
    }
}


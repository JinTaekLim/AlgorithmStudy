package week007.day2;

import java.util.*;

public class SJG_02 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            // s부터 e까지 범위 내에서 k보다 큰 값을 찾기 위해 우선 순서대로 정렬
            int[] subArray = Arrays.copyOfRange(arr, s, e + 1);
            Arrays.sort(subArray);

            // k보다 큰 값을 찾아 결과 배열에 저장
            int minVal = -1;
            for (int j = 0; j < subArray.length; j++) {
                if (subArray[j] > k) {
                    minVal = subArray[j];
                    break;
                }
            }

            result[i] = minVal;
        }

        return result;
    }
}
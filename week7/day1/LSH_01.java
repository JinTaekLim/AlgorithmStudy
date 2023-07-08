package week7.day1;

public class LSH_01 {
    public static int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i<queries.length; i++){
            int temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3},{1, 2},{1, 4}};
        solution(arr, queries);
    }
}

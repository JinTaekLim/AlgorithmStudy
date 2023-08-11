package week10.day1;

public class LSH_01 {
    public static String solution(String my_string, int[][] queries) {
        StringBuilder result = new StringBuilder(my_string);

        for(int i = 0; i < queries.length; i++) {
            int index1 = queries[i][0];
            int index2 = queries[i][1];

            char temp = result.charAt(index1);
            result.setCharAt(index1, result.charAt(index2));
            result.setCharAt(index2, temp);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String my_string = "";
        int[][] queries = {{2, 3}, {0, 9}, {5, 6}, {7, 10}};

        String result = solution(my_string, queries);
        System.out.println(result);
    }
}

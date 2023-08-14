package week010.day1;

public class LSH_01 {
    public static String solution(String my_string, int[][] queries) {
        StringBuilder result = new StringBuilder(my_string);

        for(int i = 0; i < queries.length; i++) {
            int index1 = queries[i][0];
            int index2 = queries[i][1];

            String StringSub = result.substring(index1, index2 + 1);
            System.out.println(StringSub);
            StringBuilder stringReverse = new StringBuilder(StringSub).reverse();
            System.out.println(stringReverse);
            result.replace(index1, index2 + 1, stringReverse.toString());
        }
        return result.toString();
    }
}

package week010.day1;

class SJG_01{
    public String solution(String my_string, int[][] queries) {
        char[] charArray = my_string.toCharArray();

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            reverse(charArray, start, end);
        }

        return new String(charArray);
    }

    private static void reverse(char[] charArray, int start, int end) {
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;

        }
    }
}




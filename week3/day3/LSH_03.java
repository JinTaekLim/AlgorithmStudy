package week3.day3;

public class LSH_03 {
    class Solution {
        public StringBuilder solution(String my_string, int k) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < k; i ++){
                sb.append(my_string);
            }
            return sb;
        }
    }
}

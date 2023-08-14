package week003.day3;

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

// 효율적이고 좋은 것 같아요!
//StringBuilder 쓰는게 편하고 조은것같아욤
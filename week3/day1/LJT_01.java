package week3.day1;


class Solution {
    public String solution(String str1, String str2) {
        String answer = "";

        if(str1.length()==str2.length() && str1.length() >= 1 && str1.length() <= 10)
            for(int i=0; i<str1.length(); i++){
                answer += str1.charAt(i);
                answer += str2.charAt(i);
            }

        return answer;
    }
}

//조건을 상세하게 줘서 예외가 발생하지 않게 막는 점 너무 좋아요






public class LJT_01 {
    public static void main(String[] args) {
        Solution p = new Solution();
        System.out.println(p.solution("abcdefg","ABCDEFG"));
    }
}

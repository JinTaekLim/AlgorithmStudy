package week011.day1;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(my_string.length()-n); // 문자열의 전체 길이 - 원하는 문자열의 길이를 하여 문자열 자르기
        return answer;
    }
}
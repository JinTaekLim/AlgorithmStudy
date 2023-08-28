package week012.day1;


class SJG_01 {
    class Solution {
        public String solution(String my_string, int n) {
            StringBuilder result = new StringBuilder(); //문자열 StringBuilder객체 생성

            for (int i = 0; i < n; i++) {
                result.append(my_string.charAt(i)); // 0부터 n번째까지의 문자열을 result에 저장
            }

            return result.toString(); //result에 저장된 문자열을 String객체로 변환해서 반환
        }
    }
}
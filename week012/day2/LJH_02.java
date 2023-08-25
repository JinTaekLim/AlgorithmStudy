package week012.day2;

/*
1. my_string의 접두사 만들기 (접미사처럼 배열을 사용하지 않아도 가능할듯함)
2. 접두사가 is_prefix와 같은지 비교
3. 같다면 answer값의 1 저장 후 반환하기(같지 않다면 초기값인 0 반환)
 */
public class LJH_02 {
    class Solution {
        public int solution(String my_string, String is_prefix) {
            int answer = 0;

            for (int i = 0; i < my_string.length(); i++) {
                if(my_string.substring(0,i).equals(is_prefix)){ // my_string의 접두사가 is_prefix와 같은지 비교 후 같다면 answer값의 1 저장
                    answer = 1;
                }
            }
            return answer;
        }
    }
}

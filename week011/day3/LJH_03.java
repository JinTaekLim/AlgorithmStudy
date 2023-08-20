package week011.day3;

/*
1. my_string의 접미사 배열을 만든다
2. 접미사를 배열 arr에 넣는다
3. is_suffix가 배열 arr 안에 요소인지 확인 후 맞으면 answer = 1 아니라면 answer = 0을 반환 한다
 */

public class LJH_03 {
    class Solution {
        public int solution(String my_string, String is_suffix) {
            String[] arr = new String[my_string.length()]; // 접미사 배열
            int answer = 0; // 기본적으로 answer은 0으로 초기화

            for (int i = 0; i < my_string.length(); i++) {
                arr[i] = my_string.substring(i);
            } // 배열에 my_string의 접미사 넣기
            for (String s : arr) {
                if (is_suffix.equals(s)) { // is_suffix가 배열 arr의 요소인지 확인
                    answer = 1; // 맞으면 answer에 0대입
                }
            }
            return answer; // 위의 if문이 성립되지 않는다면 초기값 0 반환
        }
    }
}
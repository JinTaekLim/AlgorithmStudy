import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;


        for (int i=0; i<my_string.length(); i++){
            if(my_string.substring(i,my_string.length()).equals(is_suffix)){
                answer = 1;
                break;
            }
        }
        // my_string의 모든 접미사를 substring으로 분리와 동시에 is_suffix와 동일한지 확인
        // 동일함이 확인되면 answer = 1로 변환 후 반복문 종료, 동일하지 않을시 기존 값인 answer = 0 반환

        return answer;
    }
}

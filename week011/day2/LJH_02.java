package week011.day2;

/*
1.접미사를 담을 배열을 선언한다 (배열의 크기는 my_string을 포함하여 하나씩 줄여나가는 형식이기 때문에 my_string.length()
2. my_string부터 하나씩 잘라 배열에 값을 추가한다
3. 접미사가 담긴 배열 answer을 사전순으로 정렬한다
*/

import java.util.Arrays;
public class LJH_02 {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()]; // 접미사 담을 배열 생성

        for (int i = 0; i < my_string.length(); i++) { // my_string을 하나씩 잘라 answer배열에 값 저장
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer); // answer배열 오름차순 정렬

        return answer;
    }
}

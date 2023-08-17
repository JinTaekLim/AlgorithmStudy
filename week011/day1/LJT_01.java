import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        for(int i=1; i<n+1; i++){
            answer += my_string.charAt(my_string.length()-i);
        }
        // for문으로 my_string의 맨 끝 단어부터 n번째 단어까지 역방향으로 하나하나 answer에 넣어줌
        // my_string이 "ProgrammerS123" 일때, 현재 단어 -> 321Sremmarg
        StringBuffer sb = new StringBuffer(answer);
        answer = sb.reverse().toString();
        // 넣어진 문장을 StringBuffer 클래스를 불러와 reverse 메소드를 이용해 문자를 거꾸로 뒤집음


        return answer;
    }
}
package week012.day1;

public class HYB_01 {
    public String solution(String my_string, int n) {
        String answer = "";

        for(int i=0; i<n; i++)
            answer+=my_string.charAt(i); //n번째까지 문자열에 하나씩 잘라 더하기
        return answer;
    }
}

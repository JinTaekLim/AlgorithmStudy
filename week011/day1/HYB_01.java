package week011.day1;

public class HYB_01 {
    public String solution(String my_string, int n) {
        String answer = "";
        int cnt=my_string.length();
        answer=my_string.substring(cnt-n);
        return answer;
    }
}

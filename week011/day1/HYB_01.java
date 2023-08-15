package week011.day1;

public class HYB_01 {
    public String solution(String my_string, int n) {
        String answer = "";
        int cnt=my_string.length();
        answer=my_string.substring(cnt-n); //뒤에서부터 n글자니까 (문자열 길이-n)해서 몇번째부터 문자열 잘라야되는지 확인
        return answer;
    }
}

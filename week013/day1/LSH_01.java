package week013.day1;

public class LSH_01 {
    public String solution(String my_string, int m, int c) {
        String result = "";
        for (int i = c - 1; i < my_string.length(); i += m) {
            // 문자열 code 에서 결과 문자열에 속하는 문자의 특징은 아래와 같다
            // 처음 : c - 1 번째 자리, 그 이후 : 처음 + m 번째 자리
            result += my_string.charAt(i);
        }
        return result;
    }
}

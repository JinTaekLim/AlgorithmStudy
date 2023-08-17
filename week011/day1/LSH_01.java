package week011.day1;

public class LSH_01 {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length()-n);
        // 문제 : 문자의 끝에서 부터 n개의 글자만 출력 해야 한다.
        // 해결 : substring 으로 자르는 시작점(문자 길이 - n)을 지정해준다.
    }
}

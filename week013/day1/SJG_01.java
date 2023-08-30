package week013.day1;


class SJG_01 {
    public String solution(String my_string, int m, int c) {
        StringBuilder result = new StringBuilder();//문자열을 저장할 StringBulider객체 생성

        for(int i = c-1; i < my_string.length(); i += m) {//i를 m자리로 끊어서 c번째 문자를 얻어내는 반복문
         result.append(my_string.charAt(i));
        }


        return result.toString();
    }
}
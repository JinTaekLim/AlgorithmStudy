package week012.day3;

class SJG_03 {
    public String solution(String my_string, int s, int e) {
        char[] charArray = my_string.toCharArray(); // 문자열 my_string을 문자배열로 변환
        while (s < e) { //
            char temp = charArray[s]; // s번째 문자를 temp에 저장
            charArray[s] = charArray[e]; //s번째 문자와 e의 문자를 체인지
            charArray[e] = temp; // e의 문자에 기존 s값 저장
            s++;
            e--;
        }

        return new String(charArray); // charArray로 새로운 문자열 반환
    }
}
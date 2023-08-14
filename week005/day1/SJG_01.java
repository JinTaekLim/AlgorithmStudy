package week005.day1;

public class SJG_01 {
    public String solution(String code) {
        char[] charArray = code.toCharArray();
        StringBuilder ret = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (mode == 0) {//모드가 0이라면

                if (charArray[i] == '1') { // 배열의 값이 1일때 mode를 1로 설정
                    mode = 1;
                } else if (i % 2 == 0) { //배열의 값이 1이 아니고 인덱스가 짝수일때 문자열의 맨 뒤의 값에 현재 배열의 값 추가
                    ret.append(charArray[i]);
                }

            } else { //모드가 1이라면
                if (charArray[i] == '1') { // 배열의 값이 1일때 mode를 1로 설정
                    mode = 0;
                } else if (i % 2 != 0) { //배열의 값이 1이 아니고 인덱스가 짝수일때 문자열의 맨 뒤의 값에 현재 배열의 값 추가
                    ret.append(charArray[i]);
                }
            }
        }

        String answer = ret.toString(); //StringBuilder로 작성한 문자열을 String으로 변환

        if (answer.isEmpty()) {
            return "EMPTY";
        } else {
            return answer;
        }

    }
}
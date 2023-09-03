package week013.day2;

public class LSH_02 {
    public String solution(int q, int r, String code) {
        String result = "";
        for (int i = r; i < code.length(); i += q) {
            // 문자열 code 에서 결과 문자열에 속하는 문자의 특징은 아래와 같다
            // 처음 : r 번째 자리, 그 이후 : r + q 번째 자리
            result += (code.charAt(i));
        }

        return result;
    }
}


/*
*     public String solution(int q, int r, String code) {
        String result = "";
        for(int i=0; i<code.length(); i++){
            if(i%q == r){
                result += code.charAt(i);
            }
        }
        return result;
    }
* */
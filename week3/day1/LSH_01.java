package week3.day1;

public class LSH_01 {
    public String solution(String str1, String str2) {
        String answer = "";

        for(int i = 0; i<str1.length() || i<str2.length(); i++){
            answer = answer.concat(String.valueOf(str1.charAt(i)))
                    .concat(String.valueOf(str2.charAt(i)));
        }

        return answer;
    }

}

// concat 를 사용하는 방법도 있었네요..!
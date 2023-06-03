package week3.day1;

public class HYB_01 {
    public String solution(String str1, String str2) {
        String answer = "";

        for(int i=0; i<str1.length(); i++){
            answer+=str1.charAt(i);
            answer+=str2.charAt(i);
        }


        return answer;
    }
}

// 완전 깔끔하네요,,
package week012.day3;

public class HYB_03 {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String tmp="";

        for(int i=0; i<e-s+1; i++){
            tmp+=my_string.charAt(e-i); //tmp라는 문자열에 e부터 s까지 뒤집어서 담기
        }

        for(int j=0; j<s; j++){
            answer+=my_string.charAt(j); //뒤집어야하는 문자열 전까지 answer에 담기
        }

        answer+=tmp+my_string.substring(e+1); //answer에 뒤집은 문자열이랑 남은 나머지 문자열 더하기

        return answer;
    }
}

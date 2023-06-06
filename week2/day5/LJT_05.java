package week2.day5;
public class LJT_05 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int mL = my_string.length();
        int oL = overwrite_string.length();
        answer = my_string.substring(0,s)+overwrite_string.substring(0,oL)+my_string.substring(s+oL,mL);

        return answer;
    }
}

// overwrite_string 을 substring 을 처음부터 끝까지 한다면 그냥 overwrite_string 을 더하는 것도 좋을 것 같아요~
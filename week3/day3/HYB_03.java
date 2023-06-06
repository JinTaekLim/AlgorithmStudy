package week3.day3;

public class HYB_03 {
    public String solution(String my_string, int k) {
        String answer = "";

        for(int i=0; i<k; i++)
            answer+=my_string;

        return answer;
    }
}

// 가장 읽기 편하고 깔끔한 것 같아요
package week4.day5;

public class HYB_05 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;

        if(flag==true)
            answer=a+b;
        else
            answer=a-b;

        return answer;
    }
}

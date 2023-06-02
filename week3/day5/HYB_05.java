package week3.day5;

public class HYB_05 {
    public int solution(int a, int b) {
        int answer = 0;
        String tmp1="";
        int tmp2=0;

        tmp1=""+a+b;
        tmp2=2*a*b;

        if(Integer.parseInt(tmp1)<tmp2)
            answer=tmp2;
        else
            answer=Integer.parseInt(tmp1);

        return answer;
    }
}

package week003.day4;

public class HYB_04 {
    public int solution(int a, int b) {
        int answer = 0;
        String tmp1="";
        String tmp2="";

        tmp1=""+a+b;
        tmp2=""+b+a;

        if(Integer.parseInt(tmp1)<Integer.parseInt(tmp2))
            answer=Integer.parseInt(tmp2);
        else
            answer=Integer.parseInt(tmp1);


        return answer;
    }
}

// 가독성이 가장 좋은 것 같아요
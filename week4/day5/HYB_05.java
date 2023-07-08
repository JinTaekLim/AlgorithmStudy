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

//if문 조건에 flag 만 작성하셔도 == true 랑 같은 의미일 것 같습니다!
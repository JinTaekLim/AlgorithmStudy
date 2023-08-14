package week003.day5;

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

// 전역변수로 사용해서 어떠한 함수 안에서 초기화 작업을 해줄 것이 아니라면 선언과 동시에 값을 할당해줘도 좋지 않을까요!?
//   ㄴ 헐!! 천재시네요..-유빈-

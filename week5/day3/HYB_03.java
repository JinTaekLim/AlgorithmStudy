package week5.day3;

public class HYB_03 {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if(a==b&&a==c&&b==c){ //세 숫자가 다 같을 때
            answer=(a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        }
        else if(a!=b&&b!=c&&a!=c){ //세 숫자가 다 다를 때
            answer=(a+b+c);
        }
        else
            answer=(a+b+c)*(a*a+b*b+c*c);







        return answer;
    }
}

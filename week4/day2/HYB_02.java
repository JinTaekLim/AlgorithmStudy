package week4.day2;

public class HYB_02 {
    public int solution(int number, int n, int m) {
        int answer = 0;

        if(number%n==0&&number%m==0)
            return 1;
        else
            return 0;


    }
}

// int answer = 0; 빼도 좋을 것 같아요
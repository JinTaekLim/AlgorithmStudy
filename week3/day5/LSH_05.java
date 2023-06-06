package week3.day5;

public class LSH_05 {
    public int solution(int a, int b) {
        int num1 = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int num2 = 2 * a * b;
        if( num1 >= num2 ){
            return num1;
        } else {
            return num2;
        }
    }
}

// 깔끔해요 !
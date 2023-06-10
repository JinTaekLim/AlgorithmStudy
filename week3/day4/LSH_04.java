package week3.day4;

public class LSH_04 {
    public int solution(int a, int b) {
        int num1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int num2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        if( num1 >= num2){
            return num1;
        } else {
            return num2;
        }
    }
}

// 간결하고 깔끔하네요
// 오 한 줄로 저렇게 표현하는게 깔끔하고 좋은 것 같아용

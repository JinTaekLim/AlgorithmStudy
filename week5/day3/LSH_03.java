package week5.day3;

public class LSH_03 {
    public int solution(int a, int b, int c) {

        if((a != b && a != c && b != c)){
            return a+b+c;
        }
        else if((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            return (int) ((a + b + c) * (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)));
        }
        else if(a == b && a == c && b == c){
            return (int) ((a + b + c) * (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)) * (Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3)));
        }
        else {
            throw new IllegalArgumentException("아무것도 해당되지 않습니다. ");
        }

    }
}

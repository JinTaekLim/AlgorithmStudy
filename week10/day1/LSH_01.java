package week10.day1;

public class LSH_01 {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if(a == b && b == c && c == d){
            return 1111 * a;
        }
        else if((a == b && b == c) || (b == c && c == d) || (a == c && c == d) || (a == b && b == d)){
            if(a == b && b == c){
                return 10 * a + d;
            }
            else if(b == c && c == d){
                return 10 * b + a;
            }
            else if(c == d && d == a){
                return 10 * c + b;
            }
            else if(a == b && b == d){
                return 10 * b + c;
            }
        }
        else if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c)) {

        }
        return answer;
    }
}

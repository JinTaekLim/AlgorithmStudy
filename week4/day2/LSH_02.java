package week4.day2;

public class LSH_02 {
    public int solution(int number, int n, int m) {
        if(number % n == 0 && number % m == 0){
            return 1;
        } else {
            return 0;
        }
    }
}

package week004.day4;

public class LSH_04 {
    public int solution(String ineq, String eq, int n, int m) {
        if(">".equals(ineq) && "=".equals(eq)){
            if(n >= m){
                return 1;
            } else {
                return 0;
            }
        }

        else if("<".equals(ineq) && "=".equals(eq)){
            if(n <= m){
                return 1;
            } else {
                return 0;
            }
        }

        else if(">".equals(ineq) && "!".equals(eq)){
            if(n > m){
                return 1;
            } else {
                return 0;
            }
        }

        else if("<".equals(ineq) && "!".equals(eq)){
            if(n < m){
                return 1;
            } else {
                return 0;
            }
        }

        else {
            return 0;
        }
    }
}

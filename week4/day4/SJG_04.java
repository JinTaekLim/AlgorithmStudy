package week4.day4;


class SJG_04 {
    public int solution(String ineq, String eq, int n, int m) {
        boolean ineq1 = false;
        boolean eq1 = false;

        if (ineq.equals("<")) {
            ineq1 = n < m;
        } else if (ineq.equals(">")) {
            ineq1 = n > m;
        }

        if (eq.equals("=")) {
            eq1 = n == m;
        } else if (eq.equals("!")) {
            eq1 = n != m;
        }

        if (ineq1 && eq1) {
            return 1;
        } else {
            return 0;
        }
    }
}
//테스트 1
//입력값 〉	"<", "=", 20, 50
//기댓값 〉	1
//실행 결과 〉	실행한 결괏값 0이 기댓값 1과 다릅니다.
//테스트 2
//입력값 〉	">", "!", 41, 78
//기댓값 〉	0
//실행 결과 〉	테스트를 통과하였습니다.
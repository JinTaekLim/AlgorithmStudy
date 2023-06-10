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

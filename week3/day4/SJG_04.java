package week3.day4;

class SJG_04 {
    public int solution(int a, int b) {
        int sum1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int sum2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));

        if (sum1 >= sum2) {
            return sum1;
        } else {
            return sum2;
        }
    }
}

// 코드 작성 방식이 저랑 비슷하군요,,!
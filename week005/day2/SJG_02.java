package week005.day2;

class SJG_02 {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        int answer = 0;
        for (int i = 0; i < included.length; i++ ) {
            if(included[i]) {
                sum += a + i * d;
            } else {
                continue;
            }
        }
        return sum;
    }
}
package week5.day3;

class SJG_03{
    public int solution(int a, int b, int c) {
        int score;
        if(a != b && b != c && a != c){
            score = a + b + c;
        } else if ( a == b && b == c && a == c) {
            score = (a + b + c) * (a * a + b * b + c*c) * (a * a * a + b * b * b + c * c * c);
        } else {
            score = (a + b + c) * (a * a + b * b + c*c);
        }

        return score;
    }
}
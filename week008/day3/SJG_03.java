package week008.day3;

class SJG_03 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean result1;
        boolean result2;
        boolean answer;
        if (x1 || x2 ) {
            result1 = true;
        } else {
            result1 = false;
        }

        if (x3 || x4) {
            result2 = true;
        } else {
            result2 = false;
        }

        if (result1 && result2 ) {
            return answer = true;
        } else {
            return answer = false;
        }
    }
}
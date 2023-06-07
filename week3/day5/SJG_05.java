package week3.day5;

class SJG_05 {
    public int solution(int a, int b) {
        int num1 = a * b * 2;
        int num2 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));

        if (num1 >= num2) {
            return num1;
        }   else {
            return num2;
        }
    }
}

// 저랑 똑같은 코드로 작성되었네요,,!!
// 코드 효율적이고 좋네욤!!
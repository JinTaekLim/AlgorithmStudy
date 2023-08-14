package week002.day1;

import java.util.Scanner;

public class LJT_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 1 ≤ a, b ≤ 100

        if(a<1 || b>100) return; // 둘 다 충족해야 하는 조건이라 AND연산자인 if(a<1 && b>100)를 써야할 것 같아요!

        System.out.print( a + " + " + b + " = ");
        System.out.println(a + b);
    }
}
// 고생하셨어요~
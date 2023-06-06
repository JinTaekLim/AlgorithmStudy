package week2.day2;

import java.util.Scanner;

public class LJT_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if(a.length()<1 || b.length()>10) return;//이 또한 AND 논리 연산자인 &&써야 할 것 같아요!

        System.out.print(a);
        System.out.print(b);
    }
}
// 깔끔하네요 ^_ '
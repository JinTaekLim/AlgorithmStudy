package week2.day1;

import java.util.Scanner;

public class LJT_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 1 ≤ a, b ≤ 100

        if(a<1 || b>100) return;

        System.out.print( a + " + " + b + " = ");
        System.out.println(a + b);
    }
}
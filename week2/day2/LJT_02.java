package week2.day2;

import java.util.Scanner;

public class LJT_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if(a.length()<1 || b.length()>10) return;

        System.out.print(a);
        System.out.print(b);
    }
}

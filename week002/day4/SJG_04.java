package week002.day4;

import java.util.Scanner;

public class SJG_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n+" is even");
        } else {
            System.out.println(n+" is odd");
        }
    }
}
// 알아보기 쉬워서 좋아요
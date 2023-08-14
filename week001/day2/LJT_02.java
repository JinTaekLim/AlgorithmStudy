package week001.day2;

import java.util.Scanner;

public class LJT_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>=-100000 && b>=-100000 || a<= 100000 && b<= 100000 ) {
            System.out.println("a = "+a);
            System.out.println("b = "+b);
        }
        else return;
    }
}

// 제한사항 맞추신 점 좋아요~!
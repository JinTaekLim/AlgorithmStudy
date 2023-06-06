package week1.day3;

import java.util.Scanner;

public class LJT_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        int i = 0;

        if(str.length()>=1 || str.length()<=10 && n<=1 || n>=5){
            while(i<n){
                System.out.print(str);
                i += 1;
            }
        }
        else return;
    }
}

// 제한사항 지키신 점도 좋고 깔끔하게 작성하셨네요!
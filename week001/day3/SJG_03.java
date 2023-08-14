package week001.day3;


import java.util.Scanner;

public class SJG_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        if (str.length()>=1 && str.length()<=10)  {
            if (n>=1 && n<=5){
                int i = 0;
                while(i<n){
                    System.out.print(str);
                    i++;
                }

            }
        }
    }
}

// 제한사항 지킨신 점 좋아요~!
package week002.day1;
import java.util.Scanner;

public class SJG_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum;
        if (a>=1 && b <= 100) {
                sum = a + b;                                                    // sum = a + b; 코드를 9번째 줄에 작성해서 코드를 한 줄 줄이는 방법도 있을 것 같아요!
                System.out.println(a + " + " + b + " = " + sum);
        }
    }
}
// 고생하셨어요~

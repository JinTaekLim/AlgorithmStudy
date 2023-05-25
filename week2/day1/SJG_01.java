package week2.day1;
import java.util.Scanner;

public class SJG_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum;
        if (a>=1 && b <= 100) {
                sum = a + b;
                System.out.println(a + " + " + b + " = " + sum);
        }
    }
}


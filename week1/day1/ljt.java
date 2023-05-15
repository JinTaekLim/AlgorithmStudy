import java.util.Scanner;

public class ljt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int A = a.length();

        if(A>=1 || A<=1000000) System.out.print(a);
        else return;
        }
}
import java.util.Scanner;

public class LJT_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if(a.length()<=1&&a.length()>=20) return;

        for(int i=0;i<a.length();i++){

            char A = a.charAt(i);

            String A1 = String.valueOf(A);
            String b = A1.toUpperCase();
            String c = A1.toLowerCase();

            if (A1 == b) System.out.print(c);
            else System.out.print(b);

        }


    }
}

// 알아보기 쉽고 깔끔하게 작성하시네요~!
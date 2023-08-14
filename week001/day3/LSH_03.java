package week001.day3;

import java.util.Objects;
import java.util.Scanner;

public class LSH_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        boolean cnt = false;
        int i = 0;

        while (!cnt) {
            System.out.print(str);
            i ++;
            if (Objects.equals(n, i)){
                break;
            }
        }
    }
}



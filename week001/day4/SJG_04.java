package week001.day4;
import java.util.Scanner;

public class SJG_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = new char[str.length()];

        for (int i=0; i<str.length(); i++){
            arr[i]=str.charAt(i);
        }

        for (int a = 0; a < arr.length; a++){
            if (arr[a] >= 'A' && arr[a] <= 'Z' ){
                arr[a] += 32;
            } else arr[a] -= 32;
        }

        System.out.println(arr);
    }
}

// 아스키 코드를 이용하여 대문자와 소문자 차이 32 적용하신거 좋은 것 같습니다.
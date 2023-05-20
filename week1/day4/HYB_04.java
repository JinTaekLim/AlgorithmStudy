import java.util.Scanner;

public class HYB_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b="";
        for(int i=0; i<a.length(); i++){
            char c=a.charAt(i);
            
            if(Character.isUpperCase(c))
                b+=Character.toLowerCase(c);
            
            if(Character.isLowerCase(c))
                b+=Character.toUpperCase(c);
        }
        System.out.print(b);
    }
}

// package week1.day4; 작성하셔서 패키지 명시하는 것이 좋을 것 같아요~!
// 코드가 전체적으로 깔끔해서 읽기 편했습니다~!
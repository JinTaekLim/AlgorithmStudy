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

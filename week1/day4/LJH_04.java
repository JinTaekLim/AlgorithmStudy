package week1.day4;

import java.util.Scanner;

public class LJH_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for(int i = 0; i < a.length(); i++){
            char alphabet = a.charAt(i);
            if(Character.isUpperCase(alphabet)){
                answer += Character.toLowerCase(alphabet);
            }
            else{
                answer += Character.toUpperCase(alphabet);
            }
        }
        System.out.println(answer);
    }
}
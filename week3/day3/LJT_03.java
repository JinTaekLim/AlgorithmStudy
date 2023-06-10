package week3.day3;

class Solution {
    public String solution(String my_string, int k) {
        String answer = "";

        if(k<1 && k>100) return "";

        int A = 0;

        for(int i=0;i<k;i++) {
            if (Character.isLowerCase(my_string.charAt(A))) {
                answer += my_string;

                if(A+1 < my_string.length()) A+=1;
            }
            else return "";
        }

        return answer;
    }
}


//A가 대문자인 이유 궁금해영!! 코드 읽기 편하고 좋네용!!!

/*
public class LJT_03 {
    public static void main(String[] args) {
        Solution p = new Solution();
        System.out.print(p.solution("a",3));
    }
}

 */


// 엄청 꼼꼼하시네요,,, 고생하셨습니다
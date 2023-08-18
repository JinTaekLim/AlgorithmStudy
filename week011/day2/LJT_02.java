import java.util.*;

class Solution {
    public String[] solution(String my_string) {
         String[] answer = new String[my_string.length()];


        for (int i=0; i<my_string.length(); i++){
            answer[i] = my_string.substring(i,my_string.length());
        }
        // my_string의 모든 접미사를 answer 배열에 저장

        Arrays.sort(answer, String.CASE_INSENSITIVE_ORDER);
        // answer 배열의 접미사들을 a~z 순으로 정렬
        


        return answer;
    }
}

public class Main {

    public static void main(String[] args) {

        Solution p = new Solution();


        //System.out.println(p.solution("banana"));

        System.out.println(Arrays.toString(p.solution("banana")));

        //System.out.println(p.solution(str,50000,5,5).toString());

    }
    }
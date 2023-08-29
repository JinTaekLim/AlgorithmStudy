import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();     // m 글자씩 자르면 크기를 확정하기 어려움으로 동적 배열 선언

        for(int i=0; i<my_string.length(); i+=m){       // substring과 반복문을 이용하여 m 글자씩 자른 단어를
            list.add(my_string.substring(i,i+m));       // 동적 배열에 추가
        }

        for(int i=0; i<list.size(); i++){               // 반복문을 사용하여 단어의 c번 인덱스만 추출하여 answer에 추가
            answer += list.get(i).charAt(c-1);
        }

        return answer;
    }
}

public class Main {

    public static void main(String[] args) {

        Solution p = new Solution();


        System.out.println(p.solution("ihrhbakrfpndopljhygc",4,2));

        //System.out.println(Arrays.toString(p.solution("banana","a")));

        //System.out.println(p.solution(str,50000,5,5).toString());

    }
    }
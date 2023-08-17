package week011.day2;

import java.util.ArrayList;
import java.util.Collections;

public class LSH_02 {
    public ArrayList<String> solution(String my_string) { //배열의 크기를 가변적으로 하기 위해 반환 타입 변경
        ArrayList<String> result = new ArrayList<>(); //새로운 list 선언
        for(int i=0; i<my_string.length(); i++){//문자의 길이 만큼 반복
            result.add(my_string.substring(my_string.length()-i-1));
            //list에 문자열 추가
            //길이 = 11, 11-i-1 부터 끝 부분까지 잘라서 list에 추가
        }
        Collections.sort(result); //사전 순으로 정렬
        return result;
    }
}

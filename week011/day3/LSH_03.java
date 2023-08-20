package week011.day3;

import java.util.ArrayList;

public class LSH_03 {
    public int solution(String my_string, String is_suffix) {
        ArrayList<String> result = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            result.add(my_string.substring(my_string.length()-i-1)); //2번 코드처럼 접미사를 배열에 넣기
            if(result.get(i).equals(is_suffix)){ //넣은 것이 is_suffix 와 같으면 바로 1 반환 후 종료
                return 1;
            }
        }
        return 0; // 배열 완성 후에도 같은 것이 없으면 0 반환
    }
}

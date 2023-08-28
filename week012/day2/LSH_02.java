package week012.day2;

import java.util.ArrayList;
import java.util.Collections;

public class LSH_02 {
    public int solution(String my_string, String is_suffix) {
        ArrayList<String> result = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            result.add(my_string.substring(0, i));
            if(result.get(i).equals(is_suffix)){
                return 1;
            }
        }
        return 0;
    }
}

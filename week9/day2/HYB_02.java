package week9.day2;

public class HYB_02 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";

        for(int n : index_list){
            for(int i=0; i<my_string.length(); i++){
                if(my_string.charAt(i)==my_string.charAt(n)){
                    answer+=my_string.charAt(i);
                    break;
                }
            }

        }

        return answer;
    }



}



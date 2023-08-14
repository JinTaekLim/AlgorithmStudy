package week006.day1;

public class LSH_01 {
    public int solution(int[] num_list) {
        String o = "";
        String n = "";
        for(int i : num_list){
            if(i%2 == 0){
                o += String.valueOf(i);
            } else {
                n += String.valueOf(i);
            }
        }
        int result = Integer.parseInt(n) + Integer.parseInt(o);
        return result;
    }

}

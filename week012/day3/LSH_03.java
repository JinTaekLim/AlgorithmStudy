package week012.day3;

public class LSH_03 {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
        String reverse = sb.reverse().toString();
        return my_string.substring(0, s) + reverse + my_string.substring(e + 1);
    }
}

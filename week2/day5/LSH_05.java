package week2.day5;

public class LSH_05 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.substring(0, s)
                + overwrite_string
                + my_string.substring(s+overwrite_string.length());
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        LSH_05 lsh05 = new LSH_05();
        lsh05.solution("He11oWor1d", "lloWorl", 2);
    }
}

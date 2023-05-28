package week2.day5;
class LJH_05 {
    public String ljh_05(String my_string, String overwrite_string, int s) {
        String answer = "";

        answer = my_string.substring(0,s)
                + overwrite_string
                + my_string.substring(s+overwrite_string.length());

        return answer;
    }
}
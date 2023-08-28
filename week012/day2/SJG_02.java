package week012.day2;

class SJG_02 {
    public static int solution(String my_string, String is_prefix) {

        if (is_prefix.length() > my_string.length()) {
            return 0; // is_prefix가 my_string보다 길면 0반환
        }

        for (int i = 0; i < is_prefix.length(); i++) {
            if (my_string.charAt(i) != is_prefix.charAt(i)) {
                return 0; // 각 문자열 0부터 i까지 일치하지 않다면 0 반환
            }
        }

        return 1;
    }
}
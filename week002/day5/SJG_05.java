package week002.day5;

class SJG_05 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string;

        if(my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        }
        return answer;
    }
}

// 제한사항을 준수하신 점 좋아요~ 만약에 if 문의 결과가 false 일 경우를 대비해서 try-catch 문을 할용하는 것도 좋을 것 같습니다!
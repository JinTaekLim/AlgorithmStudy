package week3.day1;

class SJG_01 {
    public String solution(String str1, String str2) {
        String answer = "";

        for(int i=0; i<str1.length(); i++) {
            answer += "" + str1.charAt(i) + str2.charAt(i);
        }

        return answer;
    }
}

// 아스키 코드로 출력돼서 "" 넣은 점 좋은 것 같아요
package week003.day3;

class SJG_03 {
    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k; i++) {
            sb.append(my_string);
        }
        return sb.toString();
    }
}

// 오 저랑 코드가 비슷하네요 sb를 바로 toString 하는게 더 깔끔하네요..!
// 우와 깔끔하고 멋쪄요

package week012.day2;

public class HYB_02 {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String a="";
        String[] arr=new String[my_string.length()];

        for(int i=0; i<arr.length; i++){
            a+=my_string.charAt(i);
            arr[i]=a;
        } //접두사만 담은 배열 만들기

        for(String s : arr){ //arr의 원소를 첫 번째부터 끝까지 s에 차례로 담아 is_prefix랑 비교하기
            if(s.equals(is_prefix))
                return 1;
            else
                answer+=0;
        }


        return answer;
    }
}

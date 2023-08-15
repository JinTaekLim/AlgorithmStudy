package week011.day3;

public class HYB_03 {
    public int solution(String my_string, String is_suffix) {
        String[] arr=new String[my_string.length()];
        int answer=0;
        for(int i=0; i<arr.length; i++){
            arr[i]=my_string.substring(i);
        } //02번 문제에서 했던 접미사 배열에 넣기

        for(String str : arr){ //arr의 첫 번째 원소부터 끝 원소까지 str에 하나씩 넣는 for문
            if(str.equals(is_suffix)) //str이 is_suffix랑 같으면
                answer+=1; //answer에 1더하기
            else
                answer+=0; //다르면 answer 그대로
        }

        return answer;
    }



}

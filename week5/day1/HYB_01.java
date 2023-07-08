package week5.day1;

public class HYB_01 {
    public String solution(String code) {
        String answer = "";
        int mode=0;

        //code[0] 탐색 (따로 쓴 이유는 밑 반복문에서 i%0할 때 i가 0이면 안 돼서)
        if(code.charAt(0)!='1') //0번째 글자가 1이 아닌 문자면 answer에 추가
            answer+=code.charAt(0);
        else //0번째 글자가 1이면 mode 바꾸기
            mode=1;


        //code[1]부터 끝까지 탐색
        for(int i=1; i<code.length(); i++){
            if(mode==0){
                if(code.charAt(i)!='1' && i%2==0){
                    answer+=code.charAt(i);
                }
                else if(code.charAt(i)=='1'){
                    mode=1;
                }
            }
            else if(mode==1){
                if(code.charAt(i)!='1' && i%2!=0){
                    answer+=code.charAt(i);
                }
                else if(code.charAt(i)=='1'){
                    mode=0;
                }
            }

        }

        if(answer.length()==0) //code가 모두 1로 이루어졌을 경우
            return "EMPTY";
        else
            return answer;

    }
}

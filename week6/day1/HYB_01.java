package week6.day1;

public class HYB_01 {
    public int solution(int[] num_list) {
        int answer = 0;
        String res1="";
        String res2="";

        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0) //짝수이면
                res1+=num_list[i];
            else //홀수이면
                res2+=num_list[i];
        }

        answer=Integer.parseInt(res1)+Integer.parseInt(res2);


        return answer;
    }
}

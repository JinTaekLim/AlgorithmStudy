package week5.day4;

public class HYB_04 {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul=1;
        int squ=0;
        int sum=0;

        for(int i=0; i<num_list.length; i++){
            mul*=num_list[i];
            sum+=num_list[i];
        }
        squ=sum*sum;

        if(mul<squ)
            return 1;
        else
            return 0;
    }
}

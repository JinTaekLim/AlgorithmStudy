package week6.day2;

public class HYB_02 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int last=num_list.length;

        for(int i=0; i<last; i++){
            answer[i]=num_list[i];

        }
        if(num_list[last-2]<num_list[last-1]){
            answer[last]=num_list[last-1]-num_list[last-2];
        }
        else{
            answer[last]=num_list[last-1]*2;
        }


        return answer;
    }
}

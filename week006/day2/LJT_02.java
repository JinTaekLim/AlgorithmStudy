
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};

        int[] list = new int[num_list.length + 1];
        for(int index = 0; index < num_list.length; index++) {
            list[index] = num_list[index];
        }

        int i = num_list.length-1;


        if(num_list[i] > num_list[i-1]){
            list[i+1] = num_list[i]-num_list[i-1];
        }
        else if(num_list[i] <= num_list[i-1]){
            list[i+1] = num_list[i] * 2;
        }




        answer = list;

        return answer;
    }

}

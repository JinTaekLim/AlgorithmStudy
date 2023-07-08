package week7.day2;

public class HYB_02 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int i=0; i<queries.length; i++){
            int tmp=-1;
            for(int j=queries[i][0]; j<queries[i][1]+1; j++){
                if(arr[j]>queries[i][2]){
                    if(tmp==-1){
                        tmp=arr[j];
                    }
                    else if(tmp!=-1&&tmp>arr[j]){
                        tmp=arr[j];
                    }

                }

            }answer[i]=tmp;

        }


        return answer;
    }
}

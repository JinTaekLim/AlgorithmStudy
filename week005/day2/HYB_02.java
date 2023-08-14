package week005.day2;

public class HYB_02 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int res=a;

        if(included[0]){
            answer+=res;
        }


        for(int i=1; i<included.length; i++){
            res+=d;
            if(included[i]){
                answer+=res;
            }
            //System.out.print(" "+answer);
        }


        return answer;
    }
}

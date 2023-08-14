package week004.day3;

public class HYB_03 {
    public int solution(int n) {
        int answer = 0;


        if(n%2==0){
            for(int i=1; i<=n; i++){
                if(i%2==0){
                    answer+=i*i;
                }
            }
        }
        else{
            for(int i=1; i<=n; i++){
                if(i%2!=0){
                    answer+=i;
                }
            }
        }



        return answer;
    }
}

// 정말 깔끔하게 코드 작성 잘하신 것 같아요
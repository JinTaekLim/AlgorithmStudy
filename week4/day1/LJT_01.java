package week4.day1;

class Solution {
    public int solution(int num, int n) {
        int answer = 0;

        if(num<2 && num > 100 && n<2 && n>9) return 2;
        // 왜 2를 return하신거죠..?! 반환 값이 조건과 맞지 않아서 수정이 필요 할 것 같아요!
        //처음에 answer을 0으로 지정했기 때문에 이 줄을 지워도 통과는 되네요! 결과에 아무런 영향을 안 끼치고 있어요 ㅠㅠ..
        //   ㄴ저도 궁금햇는데 잘 보고 갑니다

        if(num%n == 0) answer = 1;


        return answer;
    }
}
//

/*
public class LJT_01 {
    public static void main(String[] args) {
        Solution p = new Solution();
        System.out.print(p.solution(22,2));


    }
}

 */
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int add = a;

        for(int i=0; i<included.length; i++){
            if(included[i]==true){
                answer += add;
            }
            add += d;
        }
        return answer;
    }
}

public class test {
    public static void main(String[] args) {
        Solution p = new Solution();

        boolean[] a = {true, false, false, true, true};

        System.out.println(p.solution(3,4,a));


    }
}

//Solution 이랑 test 클래스를 한 파일에 ,, 요렇게 사용하신 이유가 있나요 ...?
//한 클래스 안에 main 을 넣으셔도 충분할 것 같아요
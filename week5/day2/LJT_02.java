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

package week3.day2;

class Solution {
    public String solution(String[] arr) {
        String answer = "";

        if(arr.length <= 1 && arr.length >= 200) return "";


        for(int i=0;i<arr.length;i++) {
            answer += arr[i];
            if (Character.isUpperCase(answer.charAt(i))) return "";
        }


        return answer;
    }
}





public class LJT_02 {
    public static void main(String[] args) {
        Solution p = new Solution();
        String[] a={"a","b","c"};
        System.out.print(p.solution(a));
    }
}

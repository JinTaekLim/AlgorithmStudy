class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        int a = num_list[0];
        int b = num_list[0];

        for (int i = 1; i < num_list.length; i++) {
            a *= num_list[i];
            b += num_list[i];
        }

        if (a < b * b) return 1;

        return answer;
    }
}
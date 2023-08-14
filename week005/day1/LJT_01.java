class Solution {
    public String solution(String code) {
        String answer = "";

        int mode = 0;
        String ret = "";

        for (int idx = 0; idx < code.length(); idx++) {


            if (mode==0 && code.charAt(idx) == '1') mode = 1;
            else if(mode==1 && code.charAt(idx) == '1') mode = 0;

            if (mode == 0 && code.charAt(idx) != '1') {
                if (idx % 2 == 0) {
                    ret += code.charAt(idx);

                }
            }


            if (mode == 1 && code.charAt(idx) != '1') {
                if (idx % 2 != 0) {
                    ret += code.charAt(idx);
             }
            }


            System.out.println("idx = "+idx+"   code["+idx+"] = "+ code.charAt(idx) +"    mode = " + mode + "    ret = "+ret);
        }

        answer = ret;

        if(answer==""){
            answer = "EMPTY";
        }

        return answer;
    }
}

public class test {
    public static void main(String[] args) {
        Solution p = new Solution();
        System.out.print(p.solution("abc1abc1abc"));


    }
}

//answer 의 공백 여부를 판단하는 것은 isEmpty 또는 equals 를 사용하는 것이 어떤가요
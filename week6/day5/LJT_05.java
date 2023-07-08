
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        answer = new int[photo.length];


        int add = 0;

        for(int i=0;i<photo.length;i++){                                    
            for(int j=0;j<photo[i].length;j++){
                // System.out.print(photo[i][j] + " ");
                for(int k=0;k<name.length;k++){
                    if(photo[i][j] == name[k]){
                        add = yearning[k];
                    }
                }
                answer[i] += add;
                add = 0;
            }
        }



        for(int i=0;i<answer.length;i++){
            System.out.print(answer[i]+" ");
        }

        return answer;
    }
}

public class test {
    public static void main(String[] args) {
        Solution p = new Solution();


        String name[] = {"may", "kein", "kain", "radi"};
        int yearning[] = {5, 10, 1, 3};
        String photo[][] = { {"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"} };

        System.out.println(p.solution(name,yearning,photo));


    }
}


package week005.day4;

public class LSH_04 {
    public int solution(int[] num_list) {
        int add = 0;
        int multi = 1;

        for(int i : num_list){
            add += i;
            multi *= i;
        }

        return (add*add > multi) ? 1 : 0;
    }
}

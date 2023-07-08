package week6.day2;

public class LSH_02 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        if(num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            answer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            answer[num_list.length] = num_list[num_list.length - 1] * 2;
        }

        return answer;
    }
}
/** PLUS
 * arraycopy
 * System.arraycopy(소스배열, 소스시작인덱스, 타겟배열, 타겟시작인덱스, 복사할길이);
 * 기존의 num_list 를 0부터 (소스시작인덱스) answer 배열의 0번째 인덱스부터 복사를 시작한다.
 */


package week011.day2;

import java.util.Arrays;

public class HYB_02 {
    public String[] solution(String my_string) {
        String[] arr=new String[my_string.length()]; //접미사를 담을 배열 생성

        for(int i=0; i<arr.length; i++)
            arr[i]=my_string.substring(i); //my_string의 0번째부터 끝글자까지 substring으로 잘라서 배열에 넣기
                                            //banana일때 my_string.substring(1)이면 1번째글자인 a부터 끝까지 자름(anana)
        Arrays.sort(arr);//배열 오름차순으로 정리

        return arr;
    }
}

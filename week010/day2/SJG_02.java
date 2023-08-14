package week010.day2;

import java.util.ArrayList;

class SJG_02 {

    public int[] solution(String[] intStrs, int k, int s, int l) {

        ArrayList<Integer> list = new ArrayList<>();//결과를 저장하기 위한 ArrayList를 생성

        for (int i = 0; i < intStrs.length; i++) {//문자열 배열 intStrs를 순회
            int tmp = Integer.parseInt(intStrs[i].substring(s, s + l));//현재 순회 중인 문자열의 s부터 s + l까지의 부분 문자열을 잘라내고 이를 정수로 변환하여 tmp 변수에 저장
            if (tmp > k) {
                list.add(tmp);//변환된 정수 tmp가 k보다 큰 경우에만 list에 추가
            }
        }
        int[] answer = new int[list.size()];//결과를 저장한 list의 크기만큼 배열 answer를 생성

        for (int i = 0; i < answer.length; i++) {//list의 요소를 배열 answer로 옮기는 작업을 수행
            answer[i] = list.get(i);//list의 i번째 요소를 배열 answer의 i번째에 대입
        }

        return answer;
    }
}
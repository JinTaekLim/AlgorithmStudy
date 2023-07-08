package week5.day5;

class SJG_05 {
    public String[] solution(String[] players, String[] callings) {
        int index = 0;
        for (String calling : callings) { //for-each 문법을 사용하여 callings 배열을 순회하면서 각 요소를 확인
            for (int i = 0; i < players.length; i++) {
                if (players[i].equals(calling)) {
                    index = i;
                    break;
                }
            }
            if (index > 0) { // 현재 인덱스의 선수를 이전 인덱스로 이동
                String temp = players[index];
                players[index] = players[index - 1];
                players[index - 1] = temp;

            }
        }

        return players;
    }
}



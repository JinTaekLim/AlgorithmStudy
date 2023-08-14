package week005.day4;

    class SJG_04 {
        public int solution(int[] num_list) {
            int num = 1;
            int sum = 0;

            for (int i = 0; i < num_list.length; i++) {
                num *= num_list[i]; // 모든 원소의 곱
                sum += num_list[i]; // 모든 원소의 합
            }

            int square = sum * sum;

            if (num < square) {
                return 1;
            } else {
                return 0;
            }
        }
    }

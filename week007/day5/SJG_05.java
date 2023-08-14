package week007.day5;

class SJG_05 {
    public int[] solution(int start, int end) {
        int[] result = new int[end - start + 1];

        for (int i = 0; i <= end - start; i++) {
            result[i] = start + i;
        }

        return result;
    }
}
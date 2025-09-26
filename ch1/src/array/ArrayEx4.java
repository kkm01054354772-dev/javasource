package array;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33, 100, 55, 95 };

        // 최대값과 최소값 출력

        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {

            if (max < score[i]) {
                max = score[i];
            } else if (min > score[i]) {
                min = score[i];
            }
        }
        System.out.printf("최대값: %d, 최소값: %d", max, min);
    }
}
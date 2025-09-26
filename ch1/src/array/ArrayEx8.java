package array;

import java.util.Arrays;

public class ArrayEx8 {
    public static void main(String[] args) {
        // 2차원 배열

        int[][] score = new int[3][4]; // 3행 4열
        score[0][0] = 78;
        score[1][1] = 68;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "\t"); // \t(tab)
            }
            System.out.println();
        }

        // 학생별(번호별) 과목별 점수
        int[][] jumsu = {
                { 100, 100, 100 },
                { 20, 50, 40 },
                { 30, 60, 50 },
                { 80, 70, 60 },
                { 60, 80, 70 }
        };

        // 표만들기
        System.out.println("번호    국어    영어    수학    총점    평균");
        System.out.println("============================================");
        for (int i = 0; i < jumsu.length; i++) {
            // 총점, 평균 변수 선언
            int sum = 0;
            float avg = 0.0f;

            System.out.printf("%3d  ", i + 1);
            for (int j = 0; j < jumsu[i].length; j++) {
                sum += jumsu[i][j];
                System.out.printf("  %5d ", jumsu[i][j]);
            }
            avg = sum / (float) jumsu[i].length;
            System.out.printf("  %5d   %5.1f", sum, avg);
            System.out.println();
        }

        // 과목별 총점 구하기
        int korean = 0, english = 0, math = 0;
        for (int i = 0; i < jumsu.length; i++) {
            korean += jumsu[i][0];
            english += jumsu[i][1];
            math += jumsu[i][2];
        }
        System.out.printf("총점 : %5d   %5d   %5d", korean, english, math);
    }

}

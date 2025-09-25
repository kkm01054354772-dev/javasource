package control;

public class ForEx3 {
    public static void main(String[] args) {
        // ********** 5줄만들기
        // 행렬 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 이중 for 문
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 구구단 만들기
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %2d ", i, j, (i * j));
            }
            System.out.println();
        }

    }
}

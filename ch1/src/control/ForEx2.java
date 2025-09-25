package control;

public class ForEx2 {
    public static void main(String[] args) {
        // 1~10 숫자 중에서 짝수만 출력
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        // 다른 방법 (홀수만 출력)
        for (int i = 1; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        // 구구단 3단 출력
        for (int i = 1; i < 10; i++) {
            System.out.printf("3 * %2d = %2d\n", i, (3 * i));
        }
        System.out.println(" ");
    }

}

package control;

import java.util.Scanner;

public class IfEx1 {
    public static void main(String[] args) {
        int x = 0;

        // x가 0과 동일하면 x == 0 출력
        if (x == 0) {
            System.out.println("x == 0");
        }

        // x가 0이 아니면 x !=0 출력
        if (x != 0) {
            System.out.println("x != 0");

        }

        // 정수를 입력받아 60이상이면 합격입니다. 속하지 않으면 불합격입니다. 출력
        Scanner sc = new Scanner(System.in);
        int score = Integer.parseInt(sc.nextLine());

        if (score >= 60) {
            System.out.println("합격입니다.");

        } else {
            System.out.println("불합격입니다.");
        }
    }
}

package control;

import java.util.Scanner;

public class WhileEx3 {
    public static void main(String[] args) {
        // 사용자한테 숫자를 계속 받아들여서 합계 출력
        // 사용자가 0 입력 시 종료

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        boolean flag = true;

        while (flag) {
            System.out.print("숫자를 입력 >> ");
            int num = Integer.parseInt(sc.nextLine());
            if (num != 0) {
                sum += num;
            } else {
                flag = false;
            }

        }
        System.out.println("합계 : " + sum);
    }
}

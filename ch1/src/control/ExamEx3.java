package control;

import java.util.Scanner;

public class ExamEx3 {
    public static void main(String[] args) {
        // 하루 일당 산출
        // 8시간까지 10030원, 초과근무 시 원래 받던 금액의 1.5배
        // 근무시간을 입력받아 하루 일당 산출 (정수형으로)

        Scanner sc = new Scanner(System.in);
        System.out.print("근무시간 : ");
        int worktime = Integer.parseInt(sc.nextLine());

        int money = 0;
        if (worktime <= 8) {
            money = worktime * 10030;
        } else if (worktime > 24) {
            System.out.println("근무시간을 확인해 주세요.");
            money = 500000;
        } else {
            money = (10030 * 8) + (int) ((worktime - 8) * (10030 * 1.5));
        }

        if (money == 500000) {
        } else {
            System.out.println("금일 일당은 " + money + "입니다.");
        }
        sc.close();
    }
}

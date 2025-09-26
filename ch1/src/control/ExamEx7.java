package control;

import java.util.Scanner;

public class ExamEx7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int money = 0;

        while (true) {
            System.out.println("-------------------------------");
            System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
            System.out.println("-------------------------------");
            System.out.print("선택 : ");

            int select = Integer.parseInt(sc.nextLine());

            // if 혹은 switch를 써도 됨
            if (select == 1) {
                System.out.print("입금액 : ");
                money = money + Integer.parseInt(sc.nextLine());
            } else if (select == 2) {
                System.out.print("출금액 : ");
                money = money - Integer.parseInt(sc.nextLine());
            } else if (select == 3) {
                System.out.println("잔고 : " + money);
            } else if (select == 4) {
                System.out.println("프로그램 종료");
                break;
            } else
                System.out.println("잘못된 번호입니다.");
        }
    }
}

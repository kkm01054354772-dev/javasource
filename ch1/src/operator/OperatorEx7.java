package operator;

import java.util.Scanner;

public class OperatorEx7 {
    public static void main(String[] args) {
        // 키보드에서 숫자를 입력받아서 숫자가 양수인지 음수인지 출력하기

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력 : ");
        int input = Integer.parseInt(sc.nextLine());

        String result = input > 0 ? "양수" : (input == 0 ? "0" : "음수");

        System.out.println(result);

    }
}

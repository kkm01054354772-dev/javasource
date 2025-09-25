package control;

import java.util.Scanner;

public class ExamEx4 {
    public static void main(String[] args) {
        // 사칙연산 계산기
        // 사용자로부터 두 숫자와 연산자(+,-,*,/)를 입력받기
        // (ex)15 + 25 = 40
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("두 번째 숫자 : ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.print("연산기호 : ");
        String op = sc.nextLine();

        int result = 0;
        int error = 0;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                error = 1;
                break;
        }
        if (error == 1) {
            System.out.println("연산기호를 확인해주세요.");
        } else {
            System.out.printf("%d %s %d = %d", num1, op, num2, result);
        }
    }
}

package operator;

import java.util.Scanner;

public class OperatorEx8 {
    public static void main(String[] args) {
        // 키보드에서 숫자를 입력받아서 입력 받은 숫자가 짝수인지 홀수인지 판별

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력 : ");
        int input = Integer.parseInt(sc.nextLine());

        String result = input % 2 == 0 ? "짝수" : "홀수";

        System.out.println(result);

    }
}

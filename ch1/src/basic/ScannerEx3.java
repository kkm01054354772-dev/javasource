package basic;

import java.util.Scanner;

// System.in : 키보드
// System.out: 화면

public class ScannerEx3 {
    public static void main(String[] args) {
        // nextInt와 nextLine을 섞어서 사용하면 문제가 발생
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자입력 : ");
        int num1 = sc.nextInt(); // 35 Enter <= Enter를 못받아들임

        System.out.print("연산자 입력 : ");
        String op = sc.nextLine(); // nextInt의 Enter가 내려와서 바로 넘어가버림

        System.out.print("두번째 숫자입력 : ");
        int num2 = sc.nextInt();

        System.out.println(op);
        System.out.println(num1 + num2);
        sc.close();

    }
}

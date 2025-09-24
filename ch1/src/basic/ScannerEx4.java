package basic;

import java.util.Scanner;

// System.in : 키보드
// System.out: 화면

public class ScannerEx4 {
    public static void main(String[] args) {
        // ScannerEx3을 개선 sc.nextLine() ==> ""
        // ""을 없애야 한다면 Inter,Float,Double로 변환

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자입력 : ");
        // String num1 = sc.nextLine(); <= num1을 사용하지 않으면 안써도 됨
        int input1 = Integer.parseInt(sc.nextLine());
        // float input1 = Float.parseFloat(sc.nextLine());
        // double input1 = Double.parseDouble(sc.nextLine());

        System.out.print("연산자 입력 : "); // +,-,*,/
        String op = sc.nextLine();

        System.out.print("두번째 숫자입력 : ");
        int input2 = Integer.parseInt(sc.nextLine());

        System.out.println(op);
        System.out.println(input1 + input2);
        sc.close();

    }
}

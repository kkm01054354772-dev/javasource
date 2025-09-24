package basic;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // print():출력, println():출력 후 엔터처리, printf():포맷지정
        System.out.print("두자리 정수를 입력 : ");
        String num = sc.nextLine(); // String이라 35 => "35"로 들어옴

        System.out.println("num = " + num); // "35"
        System.out.println("num = " + (num + 1)); // 연결

        // "35" => 35
        int input = Integer.parseInt(num);
        System.out.println("input = " + (input)); // 35
        System.out.println("input = " + (input + 1)); // 연산

    }
}

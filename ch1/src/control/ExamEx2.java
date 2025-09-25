package control;

import java.util.Scanner;

public class ExamEx2 {
    public static void main(String[] args) {
        // 세 개의 정수를 입력받아 가장 작은 값 구하기

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 수 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("두 번째 수 : ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.print("세 번째 수 : ");
        int num3 = Integer.parseInt(sc.nextLine());

        int min = num1;
        int max = num1;
        if (min > num2) {
            min = num2;
            if (min > num3)
                min = num3;
        } else {
            if (min > num3)
                min = num3;
        }

        if (max < num2) {
            min = num2;
            if (min < num3)
                min = num3;
        } else {
            if (min < num3)
                min = num3;
        }

        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);
    }
}

package control;

import java.util.Scanner;

public class IfEx2 {
    public static void main(String[] args) {
        // 점수를 입력받아 A, B, C, D 등급을 출력
        // 90 이상 A, 80이상 B, 70이상 C, 나머지 D

        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요. ");
        int score = Integer.parseInt(sc.nextLine());

        if (score >= 90) {
            System.out.println("등급 : A");

        } else if (score >= 80) {
            System.out.println("등급 : B");
        } else if (score >= 70) {
            System.out.println("등급 : C");
        } else {
            System.out.println("등급 : D");

        }

        // 변수를 이용하는 방법
        // cf ) 변수의 유효범위는 선언 위치에 따라 사용 범위가 달라진다. if문 안에 넣으면 안됨
        char grade = ' ';

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        // switch 구문 사용하여 동일한 기능 만들기
        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'D';
                break;
        }

        System.out.printf("등급 : %c", grade);

    }
}

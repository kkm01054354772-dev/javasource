package control;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {
        // 중첩 if
        // if 블럭 내에 또 다른 if문 포함(횟수 제한 없음)

        // if (true) {
        // if (condition) {
        // if (condition) {

        // } else if() {

        // } else{

        // }

        // } else {

        // }
        // } else {

        // }

        // 점수를 입력 받기
        // grade : 90점 이상이면 A, 80점 이상 B, 70점 이상 C, 나머지 D
        // opt : x0점 ~ x4점 : -, x5점 ~ x7점 : 0, x8점 이상 : + 단, D 등급은 표기 x

        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        int score = Integer.parseInt(sc.nextLine());

        char grade = ' ';
        char opt = ' ';
        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score >= 95) {
                opt = '0';
            } else {
                opt = '-';
            }

        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score >= 85) {
                opt = '0';
            } else {
                opt = '-';
            }
        } else if (score >= 70) {
            grade = 'C';
            if (score >= 78) {
                opt = '+';
            } else if (score >= 75) {
                opt = '0';
            } else {
                opt = '-';
            }
        } else {
            grade = 'D';

        }
        System.out.printf("당신의 학점은 %c%c입니다.", grade, opt);
    }
}

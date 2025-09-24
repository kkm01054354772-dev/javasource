package control;

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        // 현재 월 입력받기
        // 월이 3/4/5 : 봄, 6/7/8 : 여름, 9/10/11 : 가을, 12/1/2 : 겨울

        Scanner sc = new Scanner(System.in);
        System.out.println("월을 입력하세요.");
        int month = Integer.parseInt(sc.nextLine());
        String season = " ";

        switch (month) {
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            default:
                season = " ";
                break;
        }
        if (season == " ") {
            System.out.println("월을 확인해주세요.");
        } else {
            System.out.println("지금 계절은 " + season + "입니다.");
        }
    }
}

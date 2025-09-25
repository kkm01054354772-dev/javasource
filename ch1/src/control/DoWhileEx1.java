package control;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // 조건식이 나중에 옴 => 조건이 거짓이라도 한번은 실행
        int i = 10;
        do {
            System.out.println(i);
        } while (i < 10);

        // 1~ 100 사이의 정수를 입력받음
        // 컴퓨터 임의의 수를 생성 (1 ~ 100)
        // 컴퓨터가 생각한 숫자를 맞추기

        Scanner sc = new Scanner(System.in);
        int answer = (int) (Math.random() * 100 + 1);
        int user = 0;
        do {
            System.out.print("1 ~ 100 사이의 정수를 입력 >> ");
            user = Integer.parseInt(sc.nextLine());
            if (answer > user) {
                System.out.println("더 큰 수를 입력해보세요.");
            } else if (answer < user) {
                System.out.println("더 작은 수를 입력해보세요.");
            } else
                System.out.println("정답입니다.");
        } while (answer != user);

    }

}

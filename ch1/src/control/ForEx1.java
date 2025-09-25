package control;

public class ForEx1 {
    public static void main(String[] args) {

        // int i = 0; 초기화
        // i < args.length; 조건식
        // i++ 증감식
        for (int i = 0; i < 10; i++) {
            // 조건식이 참인 동안 반복적으로 수행할 문장
            System.out.println("i는 " + i + "입니다.");
        }

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        for (int i = 0; i < 10; i += 2) {
            System.out.println("i는 " + i + "입니다.");
        }
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        for (int i = 10; i > 0; i--) {
            System.out.println("i는 " + i + "입니다.");
        }
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        // 1~10까지 합계
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 합 = " + sum);
    }

}

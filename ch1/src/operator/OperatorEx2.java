package operator;

public class OperatorEx2 {
    public static void main(String[] args) {
        // 산술연산자: +, -, *, /, %

        int a = 10, b = 4;
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b); // 몫
        System.out.printf("%d %% %d = %d\n", a, b, a % b); // 나머지
        System.out.printf("%d / %f = %f\n", a, (float) b, a / (float) b); // 2.500000

        // 서로 다른 타입의 연산결과는 큰 타입을 따라간다
        // int / float => float
        // int / double => double

        char c1 = 'a', c2 = c1, c3 = ' ';
        // 1 사용시 기본 타입이 int 로 인식
        // char + int => int
        c3 = (char) (c1 + 1);
        int i = c1 + 1; // byte, short, char 연산 시 자동으로 int 변환
        c2++;

        // 값은 같고 타입은 다름
        System.out.println("i = " + i); // 98 << int
        System.out.println("c2 = " + c2); // b << char
        System.out.println("c3 = " + c3); // b << char

        for (char j = 'a'; j <= 'z'; j++) {
            System.out.print(j + " ");

        }

    }
}

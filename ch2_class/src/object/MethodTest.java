package object;

public class MethodTest {
    // 두 개의 인자를 받아서 덧셈 후 결과를 리턴
    int sum(int a, int b) {
        // int result = a + b;
        // return result;
        return a + b;
    }

    // 뺼셈
    double subtract(double a, double b) {
        return a - b;
    }

    // 두 개의 문자열을 받아 합쳐서 리턴
    String concat(String str1, String str2) {
        return str1 + str2;
    }

    // 한 개의 int 타입의 배열을 받아 배열을 리턴
    int[] call(int arr[]) {
        return arr;
    }

    // 나눗셈 (자동 형변환)
    double divide(float a, float b) {
        return a / b;
    }

    String print() {
        return "안녕하세요.";
    }

}

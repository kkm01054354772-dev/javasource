package object;

public class MyMath {
    long sum(long a, long b) {
        return a + b;
    }

    // 메소드 오버로딩
    // 이름이 같음
    // 매개변수의 개수 또는 타입이 달라야 함
    int sum(int a, int b) {
        return a + b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }

}

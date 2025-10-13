package inheritance;

public class AEx {
    public static void main(String[] args) {
        // 의존성이 높은 방식
        A obj = new A();
        B b = new B();
        obj.methodA(b);

    }
}

package object;

public class MethodCall {
    int iv = 10;
    static int cv = 20;
    int iv2 = cv;

    static void staticMethod1() {
        MethodCall obj = new MethodCall();
        // 클래스 변수 호출
        System.out.println(cv);
        // 인스턴스 변수 호출 << 호출 시점이 다름
        System.out.println(obj.iv);
    }

    void instanceMethod1() {
        // 클래스 변수 호출
        System.out.println(cv);
        // 인스턴스 변수 호출
        System.out.println(iv);
    }

    static void staticMethod2() {
        MethodCall obj = new MethodCall();
        // 클래스 메소드 호출
        staticMethod1();
        // 인스턴스 메소드 호출 << 호출 시점이 다름
        obj.instanceMethod1();
    }

    void instanceMethod2() {
        // 클래스 메소드 호출
        staticMethod1();
        // 인스턴스 메소드 호출
        instanceMethod1();

    }

}

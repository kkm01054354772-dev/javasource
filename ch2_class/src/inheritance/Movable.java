package inheritance;

// 멤버변수에 final 을 붙이면 상수 => 선언과 동시에 초기화 필요
public interface Movable {

    // interface에서는 상수만 선언이 가능
    // final이 없어도 상수로 인식
    int pos = 0;

    // abstract가 없어도 추상 메소드로 인식
    void move(int x, int y);

    // static, default를 사용하면 {} 사용 가능
    static void print() {

    }

    default void print2() {

    }

}

package object;

public class Card {
    // 변수
    // 1. 인스턴스(속성, 멤버, 필드) 변수 : 클래스 영역 ==> 인스턴스 생성 후
    // 2. 클래스 변수 : 클래스 영역(static) ==> 클래스가 메모리에 올라갈 때 (공유)
    // 3. 지역 변수 : 메소드 영역, 생성자 영역 (매개변수(), 내부{}) ==> 변수가 실행될 때

    String kind;
    int number;
    static int width = 100;
    static int height = 150;

}

package inheritance;

public class Child extends Parent {
    public Child() {
        super(15); // 부모의 생성자 호출
    }

    void play() {
        System.out.println("Play!");
    }

    // 오버라이딩
    @Override
    public void list() {
        // super.list();
        System.out.println("자식 클래스"); // 자식 클래스 출력
    }

}

package inheritance;

public class Parent {
    // 상속

    // 기존의 클래스 재사용하여 새로운 클래스 작성
    // 조상(부모, 상위, Super)
    // 자손(자식, 하위, 파생)

    // 상속불가
    // 생성자, 초기화 블럭은 상속되지 않는다.

    // Java는 단일상속 (extends 뒤에 한개만 올 수 있음)

    int age;
    String name;

    public Parent() {
        super(); // default
    }

    public Parent(int age) {
        this.age = age;
    }

    public void list() {
        System.out.println("부모 클래스");
    }
}

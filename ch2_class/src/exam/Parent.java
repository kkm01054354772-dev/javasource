package exam;

public class Parent {

    // 멤버변수(속성)는 외부 접근 차단
    private int num1;

    String name; // 아무것도 안붙은 경우

    protected String grade;

    // 메소드에도 private를 붙일 수 있음
    private int print() {
        return 0;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

}

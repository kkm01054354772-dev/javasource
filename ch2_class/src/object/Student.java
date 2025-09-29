package object;

public class Student {
    // Class에는 main이 없음

    // 멤버변수, 멤버메소드, 생성자

    // ------------------멤버변수
    // 이름(홍길동), 전화번호(010-1234-5678), 주소(서울시 종로구 15)
    String name;
    String tel;
    String address;

    // ------------------생성자(constructor)
    public Student() {
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", tel=" + tel + ", address=" + address + "]";
    }
    // ------------------메소드

    // 결과 반환 O
    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public String getAddress() {
        return address;
    }

    // 결과 반환 X
    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // 이름 변경

    // void changeName(String name) {
    // this.name = name;
    // }

    String changeName(String name) {
        this.name = name;
        return this.name;
    }
}
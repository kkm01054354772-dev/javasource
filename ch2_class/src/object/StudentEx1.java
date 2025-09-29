package object;

public class StudentEx1 {
    public static void main(String[] args) {

        // 객체(인스턴스) 생성
        Student obj = new Student(); // obj: 인스턴스(객체)

        // 인스턴스 초기화
        obj.name = "홍길동";
        obj.tel = "010-1234-5678";
        obj.address = "서울시 종로구";

        // 메소드 호출
        // 1) 결과 반환 O : 변수에 담거나, print
        // 2) 결과 반환 X : 호출(실행)만 되는 것 (void가 붙어있으면 반환 X)

        System.out.println(obj.getAddress());

        // 멤버 변수 값 변경 (Setter)
        Student obj2 = new Student();
        obj2.setName("성춘향");
        obj2.setTel("010-5678-1234");
        obj2.setAddress("서울시 동작구");

        // 멤버 변수 값 불러오기 (get)
        System.out.println(obj2.getName());

        // 이름 변경 메소드 호출 (홍길동 => 테스트)
        obj.changeName("테스트");
        System.out.println(obj);

        obj2.changeName("성천사");
        System.out.println(obj2);

    }
}

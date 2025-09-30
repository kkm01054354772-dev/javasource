package object;

public class SubscriberInfoEx {
    public static void main(String[] args) {
        SubscriberInfo user1 = new SubscriberInfo();
        // 속성 변경
        // 1. 직접접근 : private 사용하면 불가능
        // 2. 생성자 이용
        // 3. setter 메소드
        user1.setName("홍길동");
        user1.setId("Hong1234");
        user1.changePassword("gildong1!");
        user1.changePhone("010-1234-5678");

        // 가입자 정보 조회
        // 1. 간단조회(toString) => 개발자 확인용
        System.out.println(user1); // toString()이 자동으로 호출
        // 2. 개별조회(getter)
        System.out.println(user1.getId());
    }
}

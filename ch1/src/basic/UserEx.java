package basic;

public class UserEx {

    public static void main(String[] args) {

        String msg = """
                dkeidkdiekdidkdie
                """.stripIndent();

        // java 10 : 로컬 변수에서만 사용 가능
        var msg1 = new String();
        // String msg2 = new String();

        User user = new User();
        User user2 = new User("홍길동", 23);

        // user.name = "성춘향"; => setter
        System.out.println(user2.name());
    }
}

// 화면단 <==> backend
// ~DTO => lombok => record
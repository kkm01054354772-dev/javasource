package lang;
//Throwable

//  Exception(예외)
//  종류
//  1) 컴파일 예외 : ClassNotFoundException
//  2) 런타임 예외 : ArithmeticException
//  처리방법
//  1) 예외 처리
//  2) 예외 던지기
//  Error

public class ExceptionEx1 {
    public static void main(String[] args) {
        System.out.println(4 / 0);

        try {
            // 예외가 발생할 수 있는 코드 작성
            Class.forName("null");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // 개발자 확인용 (예외 발생한 위치 추적)
        }

    }
}

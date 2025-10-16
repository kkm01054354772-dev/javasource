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
        // System.out.println(4 / 0); // 런타임 예외

        try {
            findClass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void findClass() throws ClassNotFoundException {

        Class.forName("null");
    }
}

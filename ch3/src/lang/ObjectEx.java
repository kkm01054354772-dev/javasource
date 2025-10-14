package lang;

import java.util.Scanner;
//java.lang 패키지는 자동 import

public class ObjectEx {
    public static void main(String[] args) {
        // String str = new String();
        // String str1 =new String();

        Scanner sc = new Scanner(System.in);

        // 모든 클래스의 부모 : Object
        // 1. equals() : 주소 비교

        Object object1 = new Object();
        Object object2 = new Object();

        if (object1.equals(object2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }

        System.out.println(object1 == object2 ? "두 객체는 같다." : "두 객체는 다르다.");

        String str1 = "Hello", str2 = "Hello";
        String str3 = new String("Hello"); // heap에 따로 만듦
        System.out.println(str1.equals(str2) ? "str1 == str2" : "str1 != str2"); // 같
        System.out.println(str1.equals(str3) ? "str1 == str3" : "str1 != str3"); // 같
        System.out.println(str1 == str2 ? "str1 == str2" : "str1 != str2"); // 같
        System.out.println(str1 == str3 ? "str1 == str3" : "str1 != str3"); // 다

        Value value1 = new Value(30);
        Value value2 = new Value(30);
        System.out.println(value1.equals(value2)); // false => 오버라이딩으로 재정의 후 true

        System.out.println("object1 : " + object1); // 패키지명.클래스명@16진수 숫자
        System.out.println("value1 : " + value1); // to String 오버라이딩하면 값이 나옴
        System.out.println("str3 :" + str3); // 값

    }

}

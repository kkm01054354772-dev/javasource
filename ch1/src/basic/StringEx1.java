package basic;

public class StringEx1 {
    public static void main(String[] args) {
        // 타입
        // 1. 기본형 : int, long, float, double, char, boolean
        // 2. 참조형 : 기본형을 제외한 모든 타입, 보통 대문자로 시작 (ex) String

        // 문자열(String) : ""
        String str1 = "안녕하세요.";
        String str2 = "안녕하세요.";
        String str3 = new String("안녕하세요."); // 저장공간이 다름

        // 문자열이 같은지 비교 ==, !=
        System.out.println(str1 == str2 ? "같은 문자열" : "다른 문자열"); // 같음
        System.out.println(str1 == str3 ? "같은 문자열" : "다른 문자열"); // 다름

        // 문자열 비교시 == 대신 equals를 사용
        System.out.println(str1.equals(str3) ? "같은 문자열" : "다른 문자열"); // 같음

        // 대소문자 무시 equalsIgnoreCase
        String str4 = "abc";
        String str5 = "ABC";
        System.out.println(str4.equals(str5) ? "같은 문자열" : "다른 문자열"); // 다름
        System.out.println(str4.equalsIgnoreCase(str5) ? "같은 문자열" : "다른 문자열"); // 같음
    }
}

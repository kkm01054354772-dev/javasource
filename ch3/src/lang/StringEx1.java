package lang;

public class StringEx1 {
    public static void main(String[] args) {
        // 1. 인스턴스 생성
        // String str1 = new String("abc"); // 정식 방법
        String str1 = "abc";

        // 낱개로 분리 : "abc" => 'a', 'b', 'c'
        // charAt(인덱스 번호) : 문자열 내의 문자 호출
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

        // char 배열 => 문자열로 변경
        char[] ch = { 'A', 'B', 'C', 'D' };
        String str2 = new String(ch); // 정식 방법으로 생성해야 함
        System.out.println(str2);

    }
}

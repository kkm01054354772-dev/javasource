package lang;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {
        // 문자열 거꾸로 출력하기
        String str1 = "Hello World";

        StringBuilder str2 = new StringBuilder(str1);
        System.out.println(str2.reverse());

        for (int i = str1.length() - 1; i >= 0; i--) {
            System.out.print(str1.charAt(i));
        }

    }
}

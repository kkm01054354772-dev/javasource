package array;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        // char 배열과 String 배열
        // String : char배열 + 기능(메서드)

        String[] strArr = { "Kim", "Park", "Lee" };

        String[] strArr2 = new String[3];
        strArr2[0] = "Kim";
        strArr2[1] = new String("Park");
        strArr2[2] = "Lee";

        System.out.println(strArr2[0]);
        System.out.println(strArr2[0].charAt(0));

        // String에서 개별 char를 추출 가능
        String src = "ABCDE";
        for (int i = 0; i < src.length(); i++) {
            System.out.println(src.charAt(i));
        }
        // String => char 배열
        char[] chArr2 = src.toCharArray();
        System.out.println(Arrays.toString(chArr2));
        // char배열 => String
        char[] chArr = { 'A', 'B', 'C', 'D', 'E' };
        String str2 = new String(chArr);
        System.out.println(str2);
    }
}

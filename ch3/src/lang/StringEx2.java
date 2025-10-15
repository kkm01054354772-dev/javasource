package lang;

import java.util.Arrays;

public class StringEx2 {

    // String => immutable (변경불가)
    // 원본 문자열을 변경하지 않고 새로운 문자열을 생성
    // StringBuffer, StringBuilder => mutable (변경가능)
    // ㄴ> 멀티쓰레드, ㄴ> 단일쓰레드

    public static void main(String[] args) {
        // 1. concat() : 다른 문자열 뒤에 덧붙이기
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + str2;
        System.out.println(str3);
        // 리턴타입 존재 : *1 출력문 *2 변수
        System.out.println("concat : " + str1.concat(str2)); // *1 출력문

        // 2. contains() : 문자열 포함 여부
        boolean result = str3.contains(str1); // *2 변수
        System.out.println(result); // T,F
        if (str3.contains(str1)) {
            System.out.println("str3 뮨자열에 str1 문자열이 포함됨");
        } else {
            System.out.println("str3 뮨자열에 str1 문자열이 포함되지 않음");
        }

        // 3. compareTo() : 문자열을 사전 순으로 비교, 정렬할 때 유용
        str1 = "aaa";
        str2 = "bbb";
        System.out.println(str1.compareTo("aaa")); // 같을 때 0
        System.out.println(str1.compareTo(str2)); // 왼쪽이 작을 때 -1
        System.out.println(str2.compareTo(str1)); // 왼쪽이 클 때 1

        // 4. endsWith("suffix") : 지정된 문자열로 끝나는 지 검사
        String fileName = "file1.txt";
        if (fileName.endsWith("txt")) {
            System.out.println("텍스트 파일");
        } else {
            System.out.println("텍스트 파일 아님");
        }

        // 5. equals() : 문자열 비교, equalsIgnoreCase() : 대소문자 구별 없이 비교
        System.out.println("aaa".equals("ccc")); // false
        System.out.println("aaa".equalsIgnoreCase("AAA")); // true

        // 6. indexOf(문자(혹은 문자열)) : 문자열에서 문자의 위치값 리턴 (처음으로 나온 것)
        // indexOf(문자(혹은 문자열), 인덱스) : 인덱스 이후의 문자열에서 문자의 위치값 리턴

        str1 = "Hello";
        System.out.println(str1.indexOf('e'));
        System.out.println(str1.indexOf('k')); // 찾지 못할 경우 -1 리턴
        System.out.println(str1.indexOf('l', 3));

        // 7. lastIndexOf() : 뒤에서부터 찾아서 위치값 리턴
        str1 = "java.lang.Object";
        System.out.println(str1.lastIndexOf('.'));
        System.out.println(str1.indexOf('.'));

        // 8. length() : 문자열의 길이 반환
        int arr[] = { 3, 4, 5, 6 };
        for (int i = 0; i < arr.length; i++) {
        }

        // 9. replace() : 문자열 변경, replaceAll() : 전체 변경, replaceFirst() : 첫번째만 변경
        str1 = "Hello";
        System.out.println(str1.replace('H', 'K'));
        System.out.println(str1); // 값이 바뀌지 않음
        System.out.println("Hellollo".replace("ll", "LL")); // 전체변경
        // regex : 정규식
        System.out.println("Hellollo".replaceAll("ll", "LL")); // 전체변경
        System.out.println("Hellollo".replaceFirst("ll", "LL")); // 첫번째만변경

        // 10. split(regex) : regex를 기준으로 문자열을 배열로 나눔
        // split(regex, limit) : 리미트 개수만큼만 나눌 수 있음
        String animals = "dog,cat,bear";
        String[] arr2 = animals.split(",");
        System.out.println(arr2); // [Ljava.lang.String;@3f99bd52
        System.out.println(Arrays.toString(arr2)); // [dog, cat, bear]
        for (String s : arr2) {
            System.out.println(s);
        }
        String[] arr3 = animals.split(",", 2);
        System.out.println(Arrays.toString(arr3));
        for (String s : arr3) {
            System.out.println(s);
        }

        // 11. startWith(prefix) : 주어진 문자열 prefix로 시작하는지 검사 <==> endsWith()
        // satrtWith(prefix, toffset) : offset위치에서시작
        str1 = "java.lang.Object";
        System.out.println("java로 시작? : " + str1.startsWith("java"));
        System.out.println("lang으로 시작? : " + str1.startsWith("lang"));
        System.out.println("lang으로 시작? : " + str1.startsWith("lang", 5)); // offset으로 시작위치를 지정해줄 수 있음

        // 12. substring(beginIndex) : 시작위치부터 문자열 리턴
        // substring(beginIndex, endIndex): 시작위치- 끝위치까지 문자열 리턴 ( 끝위치는 미포함)
        System.out.println(str1.substring(10));
        System.out.println(str1.substring(5, 9)); // 9는 리턴X

        // 13. toLowerCase() / toUpperCase() : 대소문자 전체변환
        System.out.println("abcdefg".toUpperCase());
        System.out.println("ABCDEFG".toLowerCase());

        // 14. trim() : 양 끝에 존재하는 공백 제거
        System.out.println("            Hello World           ".trim()); // 중간 공백은 제거 x

        // 15. valueOf(값) : 지정된 값을 문자열로 리턴
        String str4 = String.valueOf(10);
        str4 = String.valueOf(10.3f);

    }
}

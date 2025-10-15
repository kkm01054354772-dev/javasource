package lang;

public class StringBuilderEx {
    // StringBuilder => 원본이 변경

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("ABC");
        // StringBuilder builder2 = "new StringBuilder()"; // 간단한 생성방식을 지원하지 않음

        builder.append("DEF").append("GHI");
        System.out.println(builder);

        builder.delete(0, 2); // end는 포함 x
        System.out.println(builder);

        builder.deleteCharAt(0); // index 제거
        System.out.println(builder);

        builder.insert(0, "ABC"); // offset위치에 문자열 삽입
        System.out.println(builder);

        builder.replace(0, 3, "abc");
        System.out.println(builder);

        StringBuilder builder1 = new StringBuilder("Hello");
        StringBuilder builder2 = new StringBuilder("Hello");
        System.out.println(builder1.equals(builder2) ? "같음" : "다름"); // StringBuilder에서는 주소를 비교

        // StringBuilder => String
        String str1 = builder1.toString();
        System.out.println(str1);
        String str2 = new String(builder2);
        System.out.println(str2);
        System.out.println(str1.equals(str2) ? "같음" : "다름");

        // 해당 작업이 많으면 과부하가 올 수 있어서 StringBuilder나 StringBuffer 사용 권장
        String str3 = "안녕하세요";
        str3 += "반갑습니다";
        str3 += "Hello";

    }
}

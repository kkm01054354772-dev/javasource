package lang;

// 래퍼 클래스
// 기본타입 변수를 객체(인스턴스)로 다루고자 할 때 사용
public class WrapperEx1 {
    public static void main(String[] args) {
        // boolean => Boolean
        boolean b = true;
        // Boolean boolean1 =new Boolean(b); // 취소선 사용 중단
        Boolean boolean1 = Boolean.valueOf(b);
        Boolean boolean2 = false; // Boolean.valueOf(false); 로 자동변환

        // byte => Byte
        Byte byte1 = 1;
        // 0 => int 형으로 인식
        Byte byte2 = Byte.valueOf((byte) 0);

        // char => Character
        Character ch = 'a';

        // short => Short
        // int => Integer
        Integer.parseInt("15"); // 문자열을 숫자로

        // long => Long
        Long long1 = 15L;

        // float => Float
        Float float1 = 16.5f;

        // double => Double
        Double double1 = 18.5d;
        Double.parseDouble("172.56");
    }

}

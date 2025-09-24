package basic;

public class CastingEx2 {
    public static void main(String[] args) {
        int i = 91234567;

        // 자동 형변환 float f =(float)i; 작은 타입 => 큰 타입에 대입 시 가능

        float f = i;
        int i2 = (int) f; // float이 int보다 커서 (둘다 4byte긴 함) 수동으로 형변환 해줘야 함

        double d = i; // 자동형변환
        int i3 = (int) d;

        // 형변환 가능 기본타입
        // byte, short, int, long, float, double
        // char
    }
}

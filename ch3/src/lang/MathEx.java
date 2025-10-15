package lang;

// Math : 기본적인 수학계산에 사용할 수 있는 메소드로 구성
//        모든 메소드가 static이므로 new 사용 x 
import static java.lang.Math.*;

public class MathEx {
    public static void main(String[] args) {
        // Math.random();
        // double val = 90.7552;
        // System.out.println("반올림 " + Math.round(val));
        // System.out.println("올림 " + Math.ceil(val));
        // System.out.println("버림 " + Math.floor(val));
        // System.out.println("PI " + Math.PI);

        // import를 사용하면 Math. 안써도 됨
        double val = 90.7552;
        System.out.println("반올림 " + round(val));
        System.out.println("올림 " + ceil(val));
        System.out.println("버림 " + floor(val));
        System.out.println("0 <= x < 1 " + random());
        System.out.println("PI " + PI);

    }
}

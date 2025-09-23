package basic;

public class Variable3 {
    public static void main(String[] args) {
        // 실수형 : float, double(기본)
        // float : F,f
        // double : D,d

        float score1 = 50.15F;
        double score2 = 45.125D;

        System.out.println("score1 = " + score1);
        System.out.println("score2 = " + score2);
        // %10.2f : %전체자릿수.소수점자릿수
        System.out.printf("score1 = %.2f, score2 = %f\n", score1, score2);
        System.out.printf("score1 = %10.2f, score2 = %f\n", score1, score2);
    }
}

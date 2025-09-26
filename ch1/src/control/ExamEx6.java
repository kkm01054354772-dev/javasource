package control;

public class ExamEx6 {
    public static void main(String[] args) {
        // 중첩 for 방정식 4x+ 5y = 60의 모든 해를 구해서 (x,y) 형태로 출력
        // 단 x, y는 10 이하의 자연수

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (4 * i + 5 * j == 60) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
}

package control;

public class BreakEx1 {
    public static void main(String[] args) {
        // break : switch 구문
        // 자신이 포함된 가장 가까운 반복문 벗어나기

        int sum = 0, i = 0;
        while (true) {
            if (sum > 100)
                break; // 한줄이면 {} 사용 안해도 됨
            ++i;
            sum += i;

        }
        System.out.println("i= " + i);
        System.out.println("sum= " + sum);
    }
}

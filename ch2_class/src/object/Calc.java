package object;

public class Calc {
    int plus(int x, int y) {
        return x + y;
    }

    double avg(int x, int y) {
        return plus(x, y) / 2;
    }

    void execute() {
        double result = avg(15, 9);
        println("실행결과 : " + result);
    }

    void println(String message) {
        System.out.println(message);
    }
}

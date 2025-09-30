package object;

public class ReferenceParam {
    public static void main(String[] args) {
        // 배열도 참조형
        int[] x = { 10 };
        System.out.println(x[0]);
        change(x);
        System.out.println("변경 후 : " + x[0]);
    }

    public static void change(int[] x) {
        x[0] = 1000;
        System.out.println("change() : x = " + x[0]);
    }

}

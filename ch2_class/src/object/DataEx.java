package object;

public class DataEx {
    public static void main(String[] args) {
        // 매개변수의 타입별 차이

        // Data 인스턴스 생성
        Data data = new Data();
        data.x = 10;
        change(data.x);
        System.out.println("Change 호출 후 " + data.x); // 10 (기본타입)
        change(data);
        System.out.println("Change 호출 후 " + data.x); // 15 (참조타입)

        Data data2 = copy(data);
        System.out.println("data2.x = " + data2.x);
    }

    public static void change(int x) {
        x = 15;
        System.out.println("변경 후 : " + x); // 15
    }

    public static void change(Data d) {
        d.x = 15;
        System.out.println("변경 후 : " + d.x); // 15
    }

    public static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;
        return tmp;
    }
}

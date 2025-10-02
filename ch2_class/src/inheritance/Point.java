package inheritance;

public class Point {
    int x; // 원점의 x 좌표
    int y; // 원점의 y 좌표

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0); // this : 내 생성자 호출 (위에 있는 거)
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}

package inheritance;

public class Circle extends Shape {
    // int x; // 원점의 x 좌표
    // int y; // 원점의 y 좌표
    Point point = new Point(); // 포함관계
    int r; // 반지름

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }

    // x, y, color 출력
    @Override
    void draw() {

        System.out.printf("[x = %d, y = %d, Color = %s]", point.x, point.y, color);

    }

}

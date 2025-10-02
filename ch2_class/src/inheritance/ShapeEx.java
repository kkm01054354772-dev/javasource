package inheritance;

public class ShapeEx {
    public static void main(String[] args) {

        Point point = new Point();
        System.out.println(point);

        // 1
        // Point[] points = { new Point(10, 10), new Point(20, 20), new Point(30, 30) };
        // 2
        Point[] points = new Point[3];
        points[0] = new Point(10, 10);
        // points[0] = new Point();
        // points[0].x = 10;
        // points[0].y = 10;
        points[1] = new Point(20, 20);
        // points[1] = new Point();
        // points[1].x = 20;
        // points[1].y = 20;
        points[2] = new Point(30, 30);
        // points[2] = new Point();
        // points[2].x = 30;
        // points[2].y = 30;

        Triangle triangle = new Triangle(points);
        triangle.draw();

    }
}

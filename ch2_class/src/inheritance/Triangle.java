package inheritance;

public class Triangle extends Shape {

    Point[] points = new Point[3];

    public Triangle(Point[] points) {
        this.points = points;
    }

    @Override
    void draw() {

        System.out.printf("p1[x = %d, y = %d], p2[x = %d, y = %d], p3[x = %d, y = %d], [Color = %s]", points[0].x,
                points[0].y, points[1].x, points[1].y, points[2].x, points[2].y, color);
    }

}

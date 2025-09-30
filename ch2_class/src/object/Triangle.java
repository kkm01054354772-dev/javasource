package object;

public class Triangle {
    // 속성 : 밑변(baseline), 높이(height)
    double baseLine;
    double height;

    // -------------------------------------
    // 생성자
    public Triangle() {
    }

    public Triangle(double baseLine, double height) {
        this.baseLine = baseLine;
        this.height = height;
    }

    // -------------------------------------
    // 기능 : 삼각형의 넓이 구하기(getarea())
    double getarea() {
        return baseLine * height / 2;
    }

    // setter
    public void setBaseLine(double baseLine) {
        this.baseLine = baseLine;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}

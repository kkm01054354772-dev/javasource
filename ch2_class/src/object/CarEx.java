package object;

public class CarEx {
    public static void main(String[] args) {
        // Car 인스턴스생성: 생성자 호출됨
        Car car = new Car(); // new Car(); 괄호 안의 값에 따라 불러오는 생성자가 달라짐

        // 멤버 변수 초기화
        // 1. 직접 접근 (잘 사용 X)
        car.companyName = "현대";
        car.model = "아반떼";
        car.color = "White";
        car.maxSpeed = 200;

        System.out.println(car);
        // 2. 생성자
        Car car2 = new Car("기아");
        Car car3 = new Car("현대", "소나타");
        Car car4 = new Car("현대", "아이오닉5", "Gray");
        Car car5 = new Car("현대", "포터", "Blue", 150);

        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        // 3. setter 메소드 : 초기화 + 변경
        car3.setColor("Green");
        System.out.println("색상 지정 후 " + car3);

        // println(car);
        println(car2);
        // println(car3);
        // println(car4);
        // println(car5);
        System.out.println(car2);
    }

    public static void println(Car car) {
        // 값 변경
        car.setColor("Red");

        System.out.println("=====================");
        System.out.println("제조회사 : " + car.getCompanyName());
        System.out.println("모델명 : " + car.getModel());
        System.out.println("색상 : " + car.getColor());
        System.out.println("최고속도 : " + car.getMaxSpeed());

    }

    public static void test(String str) {

    }
}

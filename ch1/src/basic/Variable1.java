package basic;

public class Variable1 {
    public static void main(String[] args) {
        // 변수 선언 후 값 할당
        int num = 10;
        int sum = num + 20;

        // println에 있는 + : 연결
        System.out.println("num 값 : " + num);
        System.out.println("num + 20 = " + sum);
        System.out.printf("num 값 : %d\n", num);

        int age = 25, maxSpeed = 10;
        System.out.println("age = " + age + ", maxSpeed = " + maxSpeed);
        System.out.printf("age = %d, maxSpeed = %d\n", age, maxSpeed);
        System.out.printf("age = %10d, maxSpeed = %5d\n", age, maxSpeed);

        // 타입 미 선언시 값 변경 가능
        num = 35;

        // 상수 선언과 할당
        final int MAX_SPEED = 20;
        System.out.println(MAX_SPEED);
        // MAX_SPEED = 30; => (X)

    }
}

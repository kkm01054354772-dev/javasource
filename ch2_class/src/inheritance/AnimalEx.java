package inheritance;

import object.Car;

public class AnimalEx {
    public static void main(String[] args) {
        // 다행성(polymorphism)
        // 여러가지 형태를 가질 수 있는 능력
        // 1) -----------
        // 부모 = new 자식 ();
        // 2) -----------
        // print (자식);
        // void print(부모){};

        Animal animal = new Animal();

        Carnivore carnivore = new Carnivore();
        carnivore.eat();
        carnivore.print();

        Herbivore herbivore = new Herbivore();
        herbivore = (Herbivore) animal; // 자식 = 부모 (X) 오류남
        herbivore.eat();

        // Animal animal = new Carnivore(); // 부모 = 자식();
        // animal.eat(); // 오버라이딩 시, 자식 클래스의 메소드 실행
        // // animal.print(); // 단, 자식 클래스에만 있는 메소드는 접근 불가
        // ((Carnivore) animal).print(); // 강제 형변환하여 사용할 수 있음

        // animal = new Herbivore();
        // animal.eat();

        // Carnivore carnivore2 = new Carnivore();
        // herbivore = (Herbivore) carnivore2(); // 상속 관계에서만 형변환 가능

    }
}

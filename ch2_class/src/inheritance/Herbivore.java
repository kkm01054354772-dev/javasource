package inheritance;

public class Herbivore extends Animal {
    // 초식동물

    public Herbivore() {
        // super();
        System.out.println("Herbivore 생성자");
    }

    @Override
    public void eat() {
        System.out.println("풀을 먹는다.");
    }
}

package inheritance;

public class FighterEx {

    public static void main(String[] args) {

        // 추상 클래스, 인터페이스는 직접적으로 인스턴스 생성이 불가 => 부모의 목적으로만 사용
        // Attackable attackable = new Attackable() ; -> (X)

        Fightable fightable = new Fighter();
        Fighter fighter = new Fighter();
    }
}

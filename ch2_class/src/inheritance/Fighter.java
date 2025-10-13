package inheritance;

public class Fighter implements Fightable {

    @Override
    public void move(int x, int y) {
        System.out.println("move");
    }

    @Override
    public void attack(Unit unit) {
        System.out.println("attack");
    }

}

package inheritance;

public class BonusPointAccount extends Account {
    private int bonusPoint;

    public BonusPointAccount(String accountNo, String owner, long balance, int bonusPoint) {

        super(accountNo, owner, balance);
        this.bonusPoint = bonusPoint;
    }

    // 예금액의 1%를 보너스포인트 적립

    @Override
    void deposit(long money) {
        // 예금
        super.deposit(money);
        // 보너스 포인트 적립
        bonusPoint += (int) (money * 0.01);

    }

    public int getBonusPoint() {
        return bonusPoint;
    }

}

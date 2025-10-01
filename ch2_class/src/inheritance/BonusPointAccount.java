package inheritance;

public class BonusPointAccount extends Account {
    private int bonusPoint;
    private long creditLine;

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
        bonusPoint = (int) (money * 0.01);

    }

    // @Override
    // long withdraw(long money, long balance, long creditLine) throws Exception {
    // if (balance + creditLine < money) {
    // throw new Exception("잔액부족");
    // } else if(balance > money) {
    // balance = balance - money;

    // } else if (balance < money) {
    // balance = balance + creditLine - money;

    // }
    // return balance;

    // }

}

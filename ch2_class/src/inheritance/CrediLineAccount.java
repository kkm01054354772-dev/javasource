package inheritance;

public class CrediLineAccount extends Account {

    private int creditLine;

    public CrediLineAccount(String accountNo, String owner, long balance, int creditLine) {
        super(accountNo, owner, balance);
        this.creditLine = creditLine;
    }

    // 출금 : 잔액 (잔액+마이너스한도) - 사용액

    @Override
    long withdraw(long money) throws Exception {

        if (super.getBalance() + creditLine < money) {
            throw new Exception("마이너스 한도 확인");
        }
        setBalance(getBalance() - money);
        return super.getBalance();
    }

}

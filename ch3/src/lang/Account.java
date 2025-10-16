package lang;

public class Account {
    // 은행계좌
    // 계좌번호(xxx-xx-xxx), 계좌주(이름), 잔액(long)
    private String accountNo; // private : 해당 클래스내에서만 접근 가능
    private String owner;
    private long balance;

    // 생성자

    public Account(String accountNo) {
        this.accountNo = accountNo;

    }

    public Account(String accountNo, String owner) {
        // this.accountNo = accountNo;
        this(accountNo);
        this.owner = owner;
    }

    public Account(String accountNo, String owner, long balance) {
        // this.accountNo = accountNo;
        // this.owner = owner;
        this(accountNo, owner);
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", owner=" + owner + ", balance=" + balance + "]";
    }

    // 기능 (입금한다(잔액+입금액). 출금한다.(잔액-출금액 / 잔액 리턴))
    void deposit(long money) {
        balance = balance + money;
    }

    long withdraw(long money) throws BalanceInsufficientException {
        if (balance < money) {
            throw new BalanceInsufficientException("잔액부족");
        }
        balance = balance - money;
        return balance;
    }

    // 속성 값 조회 (getter 메소드)
    public String getAccountNo() {
        return accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public long getBalance() {
        return balance;
    }

    // setter 메소드

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    long withdraw(long money, long balance, int creditLine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }

    long withdraw(long money, long balance, long creditLine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }

}

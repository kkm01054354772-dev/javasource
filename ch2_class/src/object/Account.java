package object;

public class Account {
    // 은행계좌
    // 계좌번호(xxx-xx-xxx), 계좌주(이름), 잔액(long)
    private String accountNo; // private : 해당 클래스내에서만 접근 가능
    private String owner;
    private long balance;

    // 생성자
    public Account(String accountNo, String owner, long balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    // 기능 (입금한다(잔액+입금액). 출금한다.(잔액-출금액 / 잔액 리턴))
    void deposit(long money) {
        balance = balance + money;
    }

    long withdraw(long money) {
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

}

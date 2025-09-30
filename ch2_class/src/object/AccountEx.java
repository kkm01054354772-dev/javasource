package object;

public class AccountEx {
    public static void main(String[] args) {

        Account account = new Account("123-12-123", "홍길동", 100000);

        // 입금
        account.deposit(50000);
        // 잔액확인
        System.out.println("잔액 : " + account.getBalance());
        // 출금 후 잔액확인
        long balance = account.withdraw(70000);
        System.out.println("잔액 : " + balance);

        Account account2 = new Account("456-12-123", "성춘향", 150000);
        System.out.println(account2.getOwner() + " 잔액 : " + account2.getBalance());
        System.out.println("===================================");
        System.out.println("계좌번호 : " + account2.getAccountNo());
        System.out.println("계좌주 : " + account2.getOwner());
        System.out.println("잔액 : " + account2.getBalance());
        System.out.println("===================================");
    }
}

package lang;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("111", "홍길동", 10000);

        try {
            account.withdraw(20000);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}

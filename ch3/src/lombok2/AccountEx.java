package lombok2;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("홍길동", "110", 120000);
        // account.getName();
        // account.setAccNo("1");
        System.out.println(account);

        Account account2 = new Account();
        account2.setName("성춘향");
        account2.setAccNo("120");
        account2.setBalance(20000);

        Account account3 = Account.builder()
                .name("이순신")
                .accNo("330")
                .balance(250000)
                .build();
    }
}

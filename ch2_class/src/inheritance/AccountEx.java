package inheritance;

public class AccountEx {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("111", "홍길동", 100000, "111-22");

        // 입금
        checkingAccount.deposit(200000);
        // 잔액
        System.out.println("잔액 : " + checkingAccount.getBalance());
        // 직불카드 사용
        try {
            System.out.println("체크카드 사용 후 잔액 : " + checkingAccount.pay("111-22", 350000));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 마이너스 한도
        CrediLineAccount crediLineAccount = new CrediLineAccount("111", "홍길동", 100000, 5000000);
        try {
            System.out.println("마이너스 한도가 있을 때의 잔액 :" + crediLineAccount.withdraw(3000000));
            // System.out.println("마이너스 한도가 있을 때의 잔액 :" +
            // crediLineAccount.withdraw(3000000));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 보너스포인트
        BonusPointAccount bonusPointAccount = new BonusPointAccount("111", "홍길동", 100000, 0);
        bonusPointAccount.deposit(500000);
        System.out.println("현재 보너스 포인트 : " + bonusPointAccount.getBonusPoint());
        bonusPointAccount.deposit(500000);
        System.out.println("현재 보너스 포인트 : " + bonusPointAccount.getBonusPoint());

        // 교통카드
        CheckingTrafficCardAccount checkingTrafficCardAccount = new CheckingTrafficCardAccount("111", "홍길동", 100000,
                "111-22", false);
        CheckingTrafficCardAccount checkingTrafficCardAccount2 = new CheckingTrafficCardAccount("222", "성춘향", 100000,
                "111-33", true);

        // 입금
        checkingTrafficCardAccount2.deposit(10000);
        // 출금
        try {
            System.out.println("출금 후 잔액 : " + checkingTrafficCardAccount2.withdraw(60000));
            System.out.println("교통 비 지급 후 잔액 : " + checkingTrafficCardAccount2.payTrafficCard("111-33", 40000));
        } catch (Exception e) {

            e.printStackTrace();
        }
        //

    }
}

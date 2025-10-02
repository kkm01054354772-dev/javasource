package inheritance;

public class CheckingTrafficCardAccount extends CheckingAccount {
    // 은행 + 체크카드 + 교통카드
    private boolean hasTrafficCard;

    public CheckingTrafficCardAccount(String accountNo, String owner, long balance, String cardNo,
            boolean hasTrafficCard) {
        super(accountNo, owner, balance, cardNo);
        this.hasTrafficCard = hasTrafficCard;
    }

    // 교통비 지급
    // 카드번호, 교통비 사용액을 인자로 받아서 카드번호가 일치하고 교통카드 기능이 있으면 지급
    // 교통카드 기능이 없으면 메시지 출력
    long payTrafficCard(String cardNo, long money) throws Exception {
        // 교통카드 기능 여부 확인
        if (!hasTrafficCard) {
            throw new Exception("교통카드 기능 사용불가");
        }
        // 부모의 pay() 호출
        return pay(cardNo, money);

    }

}
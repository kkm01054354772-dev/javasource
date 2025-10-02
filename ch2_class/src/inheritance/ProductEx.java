package inheritance;

public class ProductEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new SamsungTV(400));
        buyer.buy(new SamsungComputer(200));

        System.out.println("잔액 : " + buyer.money);
        System.out.println("보너스포인트 : " + buyer.bonusPoint);
    }
}

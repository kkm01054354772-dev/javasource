package object;

public class CardEx {
    public static void main(String[] args) {
        // 인스턴스 변수
        Card card1 = new Card();
        card1.kind = "spade";
        card1.number = 2;

        Card card2 = new Card();
        card2.kind = "spade";
        card2.number = 3;

        info(card1);
        info(card2);

        // 클래스 변수(static): 클래스이름(대문자).클래스변수
        Card.width = 80;
        Card.height = 200;

    }

    // 메소드를 사용하면 반복동작을 아낄 수 있음
    static void info(Card card) {
        System.out.println("숫자 : " + card.number);
        System.out.println("종류 : " + card.kind);
        System.out.println("가로 : " + card.width);
        System.out.println("세로 : " + card.height);
    }
}
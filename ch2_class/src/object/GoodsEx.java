package object;

public class GoodsEx {
    public static void main(String[] args) {

        GoodsStock goodsStock = new GoodsStock("p001", 35);
        GoodsStock goodsStock2 = new GoodsStock();

        goodsStock2.setName("p002");
        goodsStock2.setAmount(40);

        System.out.println(goodsStock);
        System.out.println(goodsStock2);
    }
}

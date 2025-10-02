package inheritance;

public class SamsungComputer extends Product {

    public SamsungComputer(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "SamsungComputer";
    }

}

package exam;

public class Odd extends OddDetector {

    private int n;

    public Odd(int n) {
        super(n);
    }

    @Override
    public boolean isOdd() {
        return getN() % 2 == 1;
    }

}

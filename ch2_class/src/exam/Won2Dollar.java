package exam;

public class Won2Dollar extends Converter {

    String val;
    double ratio = 1200;

    @Override
    protected double convert(double src) {
        return src / ratio;
    }

    @Override
    protected String getSrcString() {
        return "원";
    }

    @Override
    protected String getDestString() {
        return "달러";
    }

}

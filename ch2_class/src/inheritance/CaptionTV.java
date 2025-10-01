package inheritance;

public class CaptionTV extends TV {

    public CaptionTV(int size, int channel, boolean power, String color) {
        super(size, channel, power, color);
    }

    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }

}

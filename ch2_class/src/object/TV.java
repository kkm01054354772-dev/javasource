package object;

public class TV {
    // 속성 : 크기(52), 채널(7), 파워(T/F), 색상(black,white..)

    int size;
    int channel;
    boolean power;
    String color;

    // 생성자
    public TV() {
    }

    @Override
    public String toString() {
        return "TV [size=" + size + ", channel=" + channel + ", power=" + power + ", color=" + color + "]";
    }

    // 기능 : 채널변경, 전원여부, 볼륨조절

    // setter 메소드 : 값 설정, 변경
    public void setSize(int size) {
        this.size = size;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 채널 올리기, 내리기
    public void channelUp() {
        ++this.channel;
    }

    public void channelDown() {
        --this.channel;
    }

    // 불러오기
    public int getSize() {
        return size;
    }

    public int getChannel() {
        return channel;
    }

    public boolean isPower() {
        return power;
    } // boolean 타입은 getter 메소드가 is로 시작

    public String getColor() {
        return color;
    }

}

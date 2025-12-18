package exam;

public class TVEx {
    public static void main(String[] args) {
        // 객체 생성
        LGTV tv = new LGTV();
        // new LGTV(new AppleSpeaker());
        tv.setSpeaker(new AppleSpeaker());

        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();

        // SamsungTV samsungTV = new SamsungTV();
    }
}

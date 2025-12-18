package exam;

public class LGTV implements TV {

    private Speaker speaker;

    // 생성자
    public LGTV() {

    }

    public LGTV(Speaker speaker) {
        this.speaker = speaker;
    }

    // setter
    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void powerOn() {
        System.out.println("LGTV Power On");
    }

    @Override
    public void powerOff() {
        System.out.println("LGTV Power On=ff");
    }

    @Override
    public void volumeUp() {
        // System.out.println("LGTV Volume Up");
        speaker.volumeUp();
    }

    @Override
    public void volumeDown() {
        // System.out.println("LGTV Volume Down");
        speaker.volumeDown();
    }

}

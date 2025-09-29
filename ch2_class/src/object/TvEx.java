package object;

public class TvEx {
    public static void main(String[] args) {
        // TV 클래스의 instance 생성
        TV tv = new TV();

        // 전원을 켜기
        // tv.power = true;
        // tv.setsize = 48;
        // tv.channel = 3;
        // tv.color = "Black";
        tv.setPower(true);
        tv.setSize(48);
        tv.setChannel(3);
        tv.setColor("Black");

        System.out.println(tv); // 생성자 키워드에 generate to String()을 사용하면
                                // object.TV@5ca881b5 => TV [size=0, channel=0, power=false, color=null]
                                // 기본값: 0, 0.0, false, 빈문자, null

        // 2번째 인스턴스
        TV tv2 = new TV();

        tv2.setPower(true);
        tv2.setSize(40);
        tv2.setChannel(7);
        tv2.setColor("White");

        // 채널+
        tv2.channelUp();

        System.out.println(tv2);
    }
}

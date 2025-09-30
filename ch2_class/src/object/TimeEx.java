package object;

public class TimeEx {
    public static void main(String[] args) {
        Time time = new Time();

        // 시, 분, 초 지정
        time.setHour(25);
        time.setMinute(58);
        time.setSecond(59);

        System.out.println(time.getHour() + "시 " + time.getMinute() + "분 " + time.getSecond() + "초");

    }
}

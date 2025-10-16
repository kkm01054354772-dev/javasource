package util;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DateEx1 {
    public static void main(String[] args) {
        // 시스템 날짜와 시간 가져오기
        Date date = new Date();
        System.out.println(date); // Thu Oct 16 15:49:32 KST 2025
        // System.out.println(date.);

        // yyyy : year => 년도
        // MM : month => 월
        // mm : minute => 분
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        System.out.println(sdf.format(date));

    }
}

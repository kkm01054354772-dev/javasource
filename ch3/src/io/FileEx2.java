package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx2 {
    public static void main(String[] args) {
        File currDir = new File("c:\\temp");

        File[] files = currDir.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }

        if (!currDir.exists()) {
            currDir.mkdir();
        }

        File dir = new File("c:\\temp\\dir");
        File file1 = new File("c:\\temp\\dir\\file1.txt");
        File file2 = new File("c:\\temp\\file2.txt");
        File file3 = new File("c:\\temp\\file3.txt");

        if (!dir.exists())
            dir.mkdirs();
        try {
            if (!file1.exists())
                file1.createNewFile();
            if (!file2.exists())
                file2.createNewFile();
            if (!file3.exists())
                file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        files = currDir.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");

        // 날짜 형식
        // 1.java.util.Date
        // 2.java.time.LocalDate

        System.out.println("날짜       시간         형태            크기    이름");
        System.out.println("====================================================");
        for (File file : files) {
            System.out.print(sdf.format(new Date(file.lastModified()))); // file.lastModified() => long타입 반환
            if (file.isDirectory()) {
                System.out.print("\t<DIR>\t\t\t" + file.getName());
            } else {
                System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }

    }
}

package io;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {
        // 경로 지정 : /(unix) or \\(windows)
        // \\ : \n, \t와 경로 지정하는 것을 구분하기 위해 두번써야 함

        // File file = new File("c:\\temp\\file1.txt");
        File parent = new File("c:\\temp");
        File file = new File(parent, "file1.txt");

        String name = file.getName();
        System.out.println("파일명 : " + name); // 파일명 : file1.txt

        int pos = name.lastIndexOf(".");
        System.out.println("파일명 : " + name.substring(0, pos)); // 파일명 : file1
        System.out.println("확장자 : " + name.substring(pos + 1)); // 확장자 : txt
        System.out.println("경로를 포함한 파일명 : " + file.getPath());
        System.out.println("파일이 속해 있는 디렉토리 : " + file.getParent());
        System.out.println("파일 pathSeparator : " + file.pathSeparator);
        System.out.println("파일 pathSeparatorChar : " + file.pathSeparatorChar);
        System.out.println("파일 separator : " + file.separator);
        System.out.println("파일 separatorChar : " + file.separatorChar);

    }
}

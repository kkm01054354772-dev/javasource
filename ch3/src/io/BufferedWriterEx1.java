package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class BufferedWriterEx1 {
    public static void main(String[] args) {
        // 키보드에서 입력을 받아 파일에 출력하는 프로그램 작성
        // q 입력 시 입력을 중지
        Scanner sc = new Scanner(System.in);
        String input = "";
        String content = "";
        System.out.print("파일에 작성할 데이터를 입력해주세요.(중지 : q)");
        do {
            System.out.print(">>");
            input = sc.nextLine();
            content += input;
        } while (!input.equals("q"));

        try {
            FileWriter fw = new FileWriter("c:\\temp\\user.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\user.txt"));
            bw.write(content);

            bw.flush();
            bw.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
        sc.close();

    }
}

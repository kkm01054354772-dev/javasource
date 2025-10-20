package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderEx1 {
    public static void main(String[] args) {
        try {
            // InputStream in = new FileInputStream("c:\\temp\\file2.txt");
            // InputStreamReader reader = new InputStreamReader(in, "utf8");
            // BufferedReader br = new BufferedReader(reader);
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream("c:\\temp\\file2.txt"), "utf8"));

            // Writer out = new FileWriter("c:\\temp\\output3.txt");
            // BufferedWriter bw = new BufferedWriter(out);
            BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\output3.txt"));

            String input = null;
            while ((input = br.readLine()) != null) {
                bw.write(input);
                bw.newLine(); // Enter
            }

            // in.close();
            bw.flush(); // 버퍼 비우기
            bw.close();
            // out.close();

        } catch (Exception e) { // FileNotFoundException, IOExpetion 처리 가능
            e.printStackTrace();
        }
    }
}

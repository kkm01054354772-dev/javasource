package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

// ㅋㅋ 안됨
public class ReaderEx1 {
    public static void main(String[] args) {
        try {

            Reader in = new FileReader("c:\\temp\\file2.txt");
            Writer out = new FileWriter("c:\\temp\\output3.txt");

            int input = 0;
            char[] cbuf = new char[1024];
            while ((input = in.read()) != -1) {
                // cbuf = > String
                // new String(cbuf);
                out.write(cbuf);
            }

            in.close();
            out.close();

        } catch (Exception e) { // FileNotFoundException, IOExpetion 처리 가능
            e.printStackTrace();
        }
    }
}

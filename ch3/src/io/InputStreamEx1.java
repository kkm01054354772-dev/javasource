package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx1 {
    public static void main(String[] args) {
        try {

            InputStream in = new FileInputStream("c:\\temp\\img1.jpg");
            OutputStream out = new FileOutputStream("c:\\temp\\copy1.jpg");

            int input = 0;

            while ((input = in.read()) != -1) {
                // System.out.print((char) input);
                out.write(input);
            }

            in.close();
            out.close();

        } catch (Exception e) { // FileNotFoundException, IOExpetion 처리 가능
            e.printStackTrace();
        }
    }
}

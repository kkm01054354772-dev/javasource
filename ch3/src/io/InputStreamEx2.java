package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx2 {
    public static void main(String[] args) {
        try {

            InputStream in = new FileInputStream("c:\\temp\\img1.jpg");
            OutputStream out = new FileOutputStream("c:\\temp\\copy2.jpg");

            int input = 0;
            byte[] bytes = new byte[1024];
            while ((input = in.read(bytes)) != -1) {
                // System.out.print((char) input);
                out.write(bytes);
            }

            in.close();
            out.close();

        } catch (Exception e) { // FileNotFoundException, IOExpetion 처리 가능
            e.printStackTrace();
        }
    }
}

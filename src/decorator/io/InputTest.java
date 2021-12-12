package src.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException{
        int c;

        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/Users/cxy/Documents/Design Patterns/src/decorator/io/test.txt")));

            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }

            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
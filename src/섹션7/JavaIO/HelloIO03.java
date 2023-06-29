package 섹션7.JavaIO;

import java.io.FileWriter;
import java.io.Writer;

public class HelloIO03 {
    public static void main(String[] args) throws Exception{
        Writer out = new FileWriter("/tmp/hello.txt");
        out.write((int)'a');
        out.write((int)'가');
        out.write((int)'!');
        out.close();
    }
}

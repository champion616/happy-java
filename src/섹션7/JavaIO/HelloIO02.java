package 섹션7.JavaIO;

import java.io.FileInputStream;
import java.io.InputStream;

public class HelloIO02 {
    public static void main(String[] args) throws Exception{
        InputStream in = new FileInputStream("/tmp/helloio01.dat");
//        int i1 = in.read();
//        System.out.println(i1);
//        int i2 = in.read();
//        System.out.println(i2);
//        int i3 = in.read();
//        System.out.println(i3);
//        int i4 = in.read();
//        System.out.println(i4); // -1 파일의 끝
        int buf = -1;
        while((buf = in.read()) != -1){
            System.out.println(buf);
        }

        in.close();
    }
}

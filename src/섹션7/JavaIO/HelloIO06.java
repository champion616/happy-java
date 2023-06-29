package 섹션7.JavaIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class HelloIO06 {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("/tmp/my.txt")));
        String line = "";
        while((line = in.readLine()) != null){
            System.out.println(line);
        }
        in.close();
    }
}

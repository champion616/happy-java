package 섹션6.예외처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception4 {
    public static void main(String[] args) {
        try{
            // 컴파일 오류가 발생한다.
            FileInputStream fis = new FileInputStream("Exception5.java"); // Unhandled exception: java.io.FileNotFoundException
        }catch(FileNotFoundException fnfe){
            System.out.println("파일을 찾을 수 없어요");
        }
    }
}

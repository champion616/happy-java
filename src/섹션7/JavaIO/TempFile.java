package 섹션7.JavaIO;

import java.io.File;
import java.io.IOException;

// c:/temp
// /tmp
public class TempFile {
    public static void main(String[] args){
        try {
            File f = File.createTempFile("tmp_", ".dat");
            System.out.println(f.getAbsolutePath());
            System.out.println("60초 동안 멈춰있습니다.");
            try {
                // 1000밀리세컨드 = 1초
                Thread.sleep(60000); // 60초 동안 프로그램이 멈춰 있는다.
            } catch (InterruptedException e1) {
                throw new RuntimeException(e1);
            }
            f.deleteOnExit(); // JVM이 종료될 때 임시파일을 자동으로 삭제한다.
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

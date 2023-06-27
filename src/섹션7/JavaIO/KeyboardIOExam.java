package 섹션7.JavaIO;

import com.example.enumtype.Printer;

import java.io.BufferedReader;

public class KeyboardIOExam {
    public static void main(String[] args) throws Exception {
        // 키보드로부터 한줄씩 입력받고, 한줄씩 화면에 출력하시오.
        // 키보드 : System.in (InputStream 주인공)
        // 화면에 출력 : System.out (PrintStream 주인공)
        // 키보드로 입력받는다는 건 문자를 입력받는 것 : char 단위
        // char 단위의 입출력 클래스는 Reader, Writer
        // 한줄 읽기 : BufferedReader라는 클래스는 readLine() 메소드를 가지고 있다.
        //          더이상 읽어들일 것이 없으면(EOF) null을 반환
        //          장식
        // 한줄 쓰기 : PrintStream, PrintWriter

        //
        BufferedReader br = new BufferedReader();

        String line = null;
        while((line = br.readLine()) != null){ // 한줄 입력받는다.
            System.out.println("읽어들인 값 : " + line);
        }
    }
}

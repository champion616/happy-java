package 섹션7.JavaIO;

import java.io.IOException;
import java.io.InputStream;

/*
1byte가 표현할 수 있는 값 : 00000000 ~ 11111111
read() 메소드가 읽어들일 수 있는 정보는 00000000 ~ 11111111 중 1개
1byte씩 읽어들인다. 파일의 크기를 모른다. 그럼 언제까지 읽어들이느냐?
더이상 읽어들일 것이 없다. EOF 이라 한다.
int에 1byte 값을 담자. 00000000 00000000 00000000 00000000
                    00000000 00000000 00000000 11111111
EOF : -1
1 --> 00000000 00000000 00000000 00000001
1의 보수 11111111 11111111 11111111 11111110
2의 보수 11111111 11111111 11111111 11111111 : -1
 */
public class InputStreamExam01 {
    public static void main(String[] args){
        InputStream in = null;
        try{
            int data = in.read();
        }catch(IOException ex){
            System.out.println("IO 오류 : " + ex);
        }finally{
            try{
                in.close();
            }catch(IOException ex2){
                System.out.println("IO 오류2 : " + ex2);
            }
        }
    }
}
/*
키보드로부터 한줄씩 입력받아 화면에 출력하시오

1. txt파일로부터 한줄씩 입력받아 화면에 출력한다.
2. 키보드로부터 한줄씩 입력받아 파일에 출력한다. (파일명은 아큐먼트로 받아들인다.)
3. txt파일로부터 한줄씩 입력받아 다른 파일에 한줄씩 출력한다.
 */
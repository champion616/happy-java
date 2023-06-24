package 섹션5.배열과컬렉션프레임워크;
// java.lang 패키지의 클래스는 import를 하지 않아도 사용 가능하다.

import java.util.Arrays;

public class Array15 {
    public static void main(String[] args){
        char[] copyFrom = {'h', 'e', 'l', 'l', 'o', '!'};

        char[] copyTo = Arrays.copyOfRange(copyFrom, 1, 3);

        for(char c : copyTo){
            System.out.println(c);
        }

    }
}


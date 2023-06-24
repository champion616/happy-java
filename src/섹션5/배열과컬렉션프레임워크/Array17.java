package 섹션5.배열과컬렉션프레임워크;
// java.lang 패키지의 클래스는 import를 하지 않아도 사용 가능하다.

import java.util.Arrays;

public class Array17 {
    public static void main(String[] args){
        int[] array = {5,4,3,1,2};

        Arrays.sort(array);

        for(int i : array){
            System.out.println(i);
        }

    }
}


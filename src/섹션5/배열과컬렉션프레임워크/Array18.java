package 섹션5.배열과컬렉션프레임워크;
// java.lang 패키지의 클래스는 import를 하지 않아도 사용 가능하다.

import java.util.Arrays;

public class Array18 {
    public static void main(String[] args){
        int[] array = {5,4,3,1,2};

        Arrays.sort(array);

        // 1 ~ 100 중 x 라는 숫자를 생각하자.
        // 20 - 커
        // 50 - 작아
        int i = Arrays.binarySearch(array, 4);
        System.out.println(i);

    }
}


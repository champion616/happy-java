package 섹션5.배열과컬렉션프레임워크;
// java.lang 패키지의 클래스는 import를 하지 않아도 사용 가능하다.

import java.util.Arrays;

public class Array16 {
    public static void main(String[] args){
        int[] array1 = {1,2,3,4,5};
//        int[] array2 = {1,2,3,4,5}; // 0
//        int[] array2 = {1,2,3,4,6}; // -1
        int[] array2 = {1,2,3,4,4}; // 1

        // 양수, 0, 음수 (비교할 때는)
        // x - y = 결과가 양수라면?
        int compare = Arrays.compare(array1, array2);

        System.out.println(compare);

    }
}


package 섹션5.배열과컬렉션프레임워크;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args){
        int[] copyFrom = {1,2,3};

        int[] copyTo = java.util.Arrays.copyOf(copyFrom, copyFrom.length);
        if(copyTo == copyFrom){
            System.out.println("copyTo == copyFrom");
        }else{
            System.out.println("copyTo != copyFrom");
        }

        for(int c : copyTo){
            System.out.println(c);
        }
        System.out.println("------------------------");
        int[] copyTo2 = Arrays.copyOf(copyFrom, 5);

        for(int c : copyTo2){
            System.out.println(c);
        }

    }
}

// 깊은 복사(Deep Copy) vs 얕은 복사(Shallow Copy)
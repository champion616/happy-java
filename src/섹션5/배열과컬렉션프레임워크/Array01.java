package 섹션5.배열과컬렉션프레임워크;

public class Array01 {
    public static void main(String[] args){
        int[] array1;
        int array2[];
        int array3[];

        array1 = new int[5];
        array2 = new int[5];
        array3 = new int[0]; // 길이가 0인 배열도 만들 수 있음

        System.out.println(array1.length);
        System.out.println(array2.length);
        System.out.println(array3.length);

    }
}

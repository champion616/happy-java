package 섹션5.배열과컬렉션프레임워크;

public class Array04 {
    public static void main(String[] args){
        ItemForArray[] array1;
        ItemForArray array2[];

        array1 = new ItemForArray[5];
        array2 = new ItemForArray[5];

        array1[0] = new ItemForArray(500, "item01");
        array1[1] = new ItemForArray(1000, "item02");

        System.out.println(array1[0].getName());
        System.out.println(array1[2].getName()); // NullPointerException
    }
}

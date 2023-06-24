package 섹션5.배열과컬렉션프레임워크;

public class Array13 {
    public static void main(String[] args){
        ItemForArray[] array = {new ItemForArray(500, "키위"), new ItemForArray(1000, "복숭아")};

        for(ItemForArray item : array){
            System.out.println(item.getName());
            System.out.println(item.getPrice());
        }

    }
}

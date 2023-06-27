package 섹션5.배열과컬렉션프레임워크;

public class GenericBoxMain {
    public static void main(String[] args){
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.set("lee");
        String str = genericBox.get();
        System.out.println(str);

//        genericBox.set(new Integer(5)); // 컴파일 오류 발생
        GenericBox<Integer> genericBox2 = new GenericBox<>();
        genericBox2.set(new Integer(5));
        Integer intValue = genericBox2.get();
        System.out.println(intValue);

        GenericBox<Object> objBox = new GenericBox<>();
        objBox.set("hello");
        String str2 = (String)objBox.get();
        System.out.println(str2);


    }
}

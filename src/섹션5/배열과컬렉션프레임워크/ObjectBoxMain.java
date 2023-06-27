package 섹션5.배열과컬렉션프레임워크;

public class ObjectBoxMain {
    public static void main(String[] args) {
        ObjectBox box = new ObjectBox();
        box.set("lee");
        String str = (String)box.get();
        System.out.println(str);

        box.set(new Integer(5));
        Integer i = (Integer)box.get();
        System.out.println(i.intValue());
    }
}

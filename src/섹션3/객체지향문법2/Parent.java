package 섹션3.객체지향문법2;

public class Parent {
    public int i = 5;
    public void printII(){
        System.out.println(i * 2); // 10으로 예상
    }
    public void printI(){
        System.out.println("parent - print() : " + i);
    }
}

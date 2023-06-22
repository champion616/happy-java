package 섹션3.객체지향문법2;

public class Car {
    public void run(){
        System.out.println("전륜구동으로 달리다.");
    }

    @Override
    public String toString() {
        return "자동차";
    }
}

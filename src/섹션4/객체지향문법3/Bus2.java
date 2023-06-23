package 섹션4.객체지향문법3;

public class Bus2 extends Car2 {
    public Bus2(){
        super("Bus!!"); // 부모의 기본생성자를 호출하는 코드가 자동으로 삽입된다.
        System.out.println("Bus2기본생성자");
    }

    // 부모가 가지고 있는 추상메소드는 자식에서 반드시 구현해야한다.
    @Override
    public void run() {
        System.out.println("후륜구동으로 달린다.");
    }
}

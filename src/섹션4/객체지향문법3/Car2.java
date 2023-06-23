package 섹션4.객체지향문법3;

public abstract class Car2 {
    public Car2(String name){
//        super(); // 자동으로 들어간다.
        System.out.println("Car2() 기본생성자 호출");
    }

    // 추상메소드. Car2를 만든 사람은 run() 메소드가 필요하다 생각했다.
    // run()은 자동차는 꼭 가지고 있지만, 자동차마다 다르게 구현할 것 같다.
    public abstract void run();
}

package 섹션3.객체지향문법2;

// Bus는 자동차의 한 종류다.
public class Bus extends Car {
    public void run(){
        System.out.println("후륜구동으로 달리다.");
    }

    public void 안내방송(){
        System.out.println("안내방송 하다.");
    }
}

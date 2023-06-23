package 섹션4.객체지향문법3;

public class BeanFactoryMain {
    public static void main(String[] args){
        BeanFactory bf1 = BeanFactory.getInstance();
        BeanFactory bf2 = BeanFactory.getInstance();
        if(bf1 == bf2){
            System.out.println("bf1 == bf2");
        }

        Bus b1 = bf1.getBus(); // 생성 과정을 다른 객체에게 맡김
        Bus b2 = bf1.getBus(); // 객체 생성을 대신해주는 클래스를 팩토리라 한다.

        // Bus b3 = new Bus();
    }
}

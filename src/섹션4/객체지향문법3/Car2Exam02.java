package 섹션4.객체지향문법3;

import 섹션3.객체지향문법2.Parent;

public class Car2Exam02 {
    public static void main(String[] args) {
//        Car2 c = new Car2("champion"); // 'Car2' is abstract; cannot be instantiated

//        Bus2 b = new Bus2();
//        b.run();
//
//        SportsCar s1 = new SportsCar("sportsCar!!");
//        s1.run();

//        Car2 c = ...;
//        c.run(); // 어떤 결과가 나올까? 생성된 객체가 오버라이딩한 run()이 실행됨
        // 동적인 언어

        Car2[] arr = new Car2[2]; // Car2를 2개 참조할 수 있는 배열을 선언
        arr[0] = new Bus2();
        arr[1] = new SportsCar("sportsCar!!");
        for(Car2 c : arr){
            c.run();
        }

    }
}

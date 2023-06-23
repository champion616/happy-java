package 섹션4.객체지향문법3;

import 섹션3.객체지향문법2.Parent;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // a() 메소드를 가지고 있는 클래스가 있다.
        // 이 클래스의 이름이 아직 무엇인지 모르겠다.
        // 나중에 이 클래스의 이름을 알려주겠다.
        // a() 메소드를 실행할 수 있는 코드를 작성하라

//        Bus b1 = new Bus();
//        b1.a();
//        레퍼런스변수명.a();

        // className에 해당하는 클래스 정보를 CLASSPATH에서 읽어들이고,
        // 그 정보를 clazz가 참조하도록 한다.
        // 아래의 세 줄은 Object o = new Bus(); 와 같다.
        // Car c = new Bus();

//        String className = "섹션4.객체지향문법3.Bus";
//        String className = "섹션4.객체지향문법3.SuperCar";
        String className = "섹션4.객체지향문법3.MyHome"; // ClassCastException

        Class clazz = Class.forName(className); // JVM은 클래스를 CLASSPATH에서 찾는다.
//        Method[] declaredMethods = clazz.getDeclaredMethods();
//        for(Method m : declaredMethods){
//            System.out.println(m.getName());
//        }
        Object o = clazz.newInstance(); // Bus 인스턴스가 생성됨
//        Bus b = (Bus)o; // ClassCastException
//        SuperCar b = (SuperCar)o;
//        Car b = (Car)o;
//        b.a();

        Method m = clazz.getDeclaredMethod("a", null); // a() 메소드 정보를 가지고 있는 Method를 반환하라
        m.invoke(o, null); // Object o가 참조하는 객체의 m 메소드를 실행하라

    }
}

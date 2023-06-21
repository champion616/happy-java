package 섹션2.객체지향문법1;

public class VendingMachineMain {
    public static void main(String[] args){
        VendingMachine.printVersion();
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductButton(100);
        System.out.println(product);
        String product2 = vm2.pushProductButton(200);
        System.out.println(product2);

    }
}

// javac VendingMachine.java
// javac VendingMachineMain.java
// java VendingMachineMain
// VendingMachineMain을 어디에서 찾아서 실행할까요?

// javac Hello.java
// Hello.java Hello.class
// java Hello
// 오답 ) 현재 폴더에서 찾는다.
// 정답 ) JVM은 CLASSPATH 경로에서 Hello클래스를 찾아 실행한다. CLASSPATH=. 으로 잡혀있다고 생각하자.
// CLASSPATH에 .(점)이 있는 경우 현재 경로에서 클래스를 찾을 수 있게된다.

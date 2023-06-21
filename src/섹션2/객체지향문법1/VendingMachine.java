package 섹션2.객체지향문법1;

public class VendingMachine {
    // field (가지는 것들)
    // constructor
    // method
    public String pushProductButton(int menuId) {
        System.out.println(menuId + "를 전달 받았습니다.");
        return "콜라";
    }

    public static void printVersion(){
        System.out.println("v1.0");
    }
}

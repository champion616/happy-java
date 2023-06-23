package 섹션4.객체지향문법3;

public class StringExam2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        if(str1.equals(str2)){ // 값이 같으냐?
            System.out.println("str1과 str2의 값이 같다.");
        }

        String s = str1.toUpperCase();
        System.out.println(s);
        System.out.println(str1); // String은 불변클래스이다.

        String substring = str1.substring(3);
        System.out.println(substring);
        System.out.println(str1);

    }
}

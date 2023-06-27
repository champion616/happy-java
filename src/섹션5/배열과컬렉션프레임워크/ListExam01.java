package 섹션5.배열과컬렉션프레임워크;

import java.util.ArrayList;

public class ListExam01 {
    public static void main(String[] args){
        // 자료구조객체들은 제네릭을 사용하지 않으면
        // Object타입을 저장한다.
        ArrayList list = new ArrayList(); // 순서를 기억함
        list.add("kim");
        list.add("lee");
        list.add("hong");

        String str1 = (String)list.get(0);
        String str2 = (String)list.get(1);
        String str3 = (String)list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}

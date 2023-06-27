package 섹션5.배열과컬렉션프레임워크;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ListExam02 {
    public static void main(String[] args){
        // 자료구조객체들은 제네릭을 사용하지 않으면
        // Object타입을 저장한다.
//        ArrayList<String> list = new ArrayList<>(); // 순서를 기억함
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        String str1 = list.get(0);
        String str2 = list.get(1);
        String str3 = list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}

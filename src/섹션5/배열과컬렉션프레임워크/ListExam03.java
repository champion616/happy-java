package 섹션5.배열과컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ListExam03 {
    public static void main(String[] args){
//        Collection<String> collection = new ArrayList<>();
        Collection<String> collection = new HashSet<>(); // 인터페이스 타입을 사용하도록 훈련해야함
//        Collection<String> collection = null; // Collection을 구현하고 있는 자료구조
        // 인터페이스를 이용해서 프로그래밍 해야함
        // 참조 타입을 인터페이스로 해야함
        // HashSet 클래스보다 더 나은 클래스가 나온 경우 수정에 용이함

        collection.add("kim");
        collection.add("lee");
        collection.add("hong");

        System.out.println(collection.size());

        Iterator<String> iter = collection.iterator(); // 모든 자료를 꺼내기위한 인터페이스
        while(iter.hasNext()){ // 꺼낼게 있는지
            String str = iter.next(); // 꺼냄
            System.out.println(str);
        }

    }
}

package 섹션5.배열과컬렉션프레임워크;

import java.util.*;

public class MapExam2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");
        map.put("k3", "안녕하세요"); // 기존의 값을 덮어씀

        Set<String> keySet = map.keySet(); // 모든 key에 접근할 수 있는 Set 객체
        Iterator<String> iter = keySet.iterator();
        while (iter.hasNext()){
            String key = iter.next();
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }

    }
}

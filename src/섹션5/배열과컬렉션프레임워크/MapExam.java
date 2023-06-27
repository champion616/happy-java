package 섹션5.배열과컬렉션프레임워크;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");
        map.put("k3", "안녕하세요"); // 기존의 값을 덮어씀

        System.out.println(map.get("k1"));
        System.out.println(map.get("k2"));
        System.out.println(map.get("k3"));
    }
}

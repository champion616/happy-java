package com.example.enumtype;

import java.util.EnumMap;

public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap emap = new EnumMap(Day.class);
        emap.put(Day.MONDAY, "월요일 좋아~");
        emap.put(Day.WEDNESDAY, "수요일수요일");
        emap.put(Day.SATURDAY, "미친듯이 노는거야~");

        System.out.println(emap.get(Day.SATURDAY));
    }
}

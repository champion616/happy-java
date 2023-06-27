package 섹션5.배열과컬렉션프레임워크;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetExam02 {
    public static void main(String[] args) {
        Set<MyData> mySet = new HashSet<>();
        mySet.add(new MyData("lee", 34));
        mySet.add(new MyData("hong", 3));
        mySet.add(new MyData("kim", 4));
        mySet.add(new MyData("kim", 4));

        Iterator<MyData> iter = mySet.iterator();
        while(iter.hasNext()){
            MyData myData = iter.next();
            System.out.println(myData);
        }


    }
}

class MyData{
    private String name;
    private int value;

    public MyData(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        System.out.println("equals()!!!");
        return value == myData.value && Objects.equals(name, myData.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode()!!!");
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "MyData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}

package 섹션5.배열과컬렉션프레임워크;
// java.lang 패키지의 클래스는 import를 하지 않아도 사용 가능하다.

import java.util.Arrays;
import java.util.Comparator;

public class Array172 {
    public static void main(String[] args){
        Item[] items = new Item[5];
        items[0] = new Item("Java", 5000);
        items[1] = new Item("Python", 6000);
        items[2] = new Item("JavaScript", 4000);
        items[3] = new Item("C#", 98000);
        items[4] = new Item("Dart", 53000);

        // sort(Object[] o) - Object는 모든 객체의 조상이니, 어떤 객체의 배열이든 가능하다.
//        Arrays.sort(items); // ClassCastException

        // 외부에서 정렬, 정렬방법정의
//        Arrays.sort(items, new ItemSorter());

//        Arrays.sort(items, new Comparator(){
//            @Override // o1 - o2
//            public int compare(Object o1, Object o2) {
//                Item item1 = (Item)o1;
//                Item item2 = (Item)o2;

//                return item1.getName().compareTo(item2.getName());
//            }
//        });

//        Arrays.sort(items, (item1, item2) -> {
//                return item1.getName().compareTo(item2.getName());
//            }
//        );

        Arrays.sort(items, (item1, item2) -> item1.getName().compareTo(item2.getName()));

        Arrays.sort(items, (Object o1, Object o2) -> {
                    Item item1 = (Item)o1;
                    Item item2 = (Item)o2;

                    return item1.getName().compareTo(item2.getName());
                }
        );



        for(Item item : items){
            System.out.println(item);
        }
    }
}

class ItemSorter implements Comparator{ // 메소드가 하나만 있는 람다 인터페이스
    @Override // o1 - o2
    public int compare(Object o1, Object o2) {
        Item item1 = (Item)o1;
        Item item2 = (Item)o2;

        return item1.getName().compareTo(item2.getName());
    }
}

// Comparable은 어떤 Item이 큰지, 작은지 기준을 정하는 Interface
class Item implements Comparable{
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // 파라미터로 들어온 Object와 내 자신을 비교하는 메소드
    // compareTo에는 Object를 받아들이지만 실제로는 Item이 들어온다. (Item 끼리 비교함)
    // 홍길동 > 고길동 : 양수 / 유니코드 순으로 비교
//    @Override
//    public int compareTo(Object o) {
//        Item d = (Item)o;
//
//        return this.name.compareTo(d.name); // 양수, 0, 음수
//    }


    // 가격끼리 비교할 경우
    @Override
    public int compareTo(Object o) {
        Item d = (Item)o;

        return this.price - d.price;
    }
}
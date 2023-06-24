package 섹션5.배열과컬렉션프레임워크;

public class ItemForArray { // 불변 클래스
    private int price;
    private String name;
    public ItemForArray(int price, String name){
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

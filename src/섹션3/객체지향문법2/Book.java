package 섹션3.객체지향문법2;

/**
 * JavaDoc 주석문
 *
 * 책 한 권의 정보를 담기 위한 클래스
 * @author
 * @since
 * @version 0.1
 */


public class Book {
    private String title;
    private int price; // field price

    // 필드의 값을 수정하고 얻기 위한 메소드를 만든다. setter, getter
    // setter, getter 메소드를 프로퍼티(property)라 한다. - price 프로퍼티
    public int getPrice() {
        return this.price; // this는 내 자신 인스턴스를 참조하는 예약어
    }

    public void setPrice(int price) { // 지역변수 price
        this.price = price;
    }

//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
    public String getName() { // Book클래스는 name 프로퍼티를 가지게됨
        return title;
    }

    public void setName(String title) {
        this.title = title;
    }
}

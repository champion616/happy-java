package 섹션3.객체지향문법2;

public class BookExam01 {
    public static void main(String[] args){
        Book b1 = new Book();
//        b1.price = 100; // private 필드는 직접 접근 못한다.
//        System.out.println(b1.price);

        b1.setPrice(500);
        b1.setName("김성박의 즐거운 자바");
        System.out.println(b1.getPrice());
        System.out.println(b1.getName());
    }
}

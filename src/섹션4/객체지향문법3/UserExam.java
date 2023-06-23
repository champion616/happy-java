package 섹션4.객체지향문법3;

public class UserExam {
    public static void main(String[] args){
//        User user = new User();
        User user = new User("이수현", "justbethechampion@gmail.com");

//        System.out.println(user.getName());
//        System.out.println(user.getEmail());
        System.out.println(user);

        User user2 = new User("이미미", "lee@example.com", "1234");
        System.out.println(user2.getName());
        System.out.println(user2.getEmail());
        System.out.println(user2.getPassword());
        System.out.println(user2);

    }
}

package 섹션5.배열과컬렉션프레임워크;

public class UnlimitedArgumentsExam {
    public static void main(String[] args){
        System.out.println(sum(5,10));
        System.out.println(sum(1,2,3,5));
        System.out.println(sum(4,3,2,6,7,8));
    }

    public static int sum(int... args){
        System.out.println("print1 메소드 - args 길이 : " + args.length);
        int sum = 0;
        for(int i=0; i<args.length; i++){
            sum += args[i];
        }

        return sum;
    }
}

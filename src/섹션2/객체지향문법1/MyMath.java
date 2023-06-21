package 섹션2.객체지향문법1;

public class MyMath {

    private MyMath(){

    }

    public static int abs(int a){
        if(a < 0){
            return a * -1;
        }else{
            return a;
        }
    }
}

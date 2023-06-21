public class Gugudan1 {
    public static void main(String[] args){
        for(int i=1; i<=9; i++){
            System.out.println("2 * " + i + " = " + (2 * i));
        }

        for(int j=2; j<=9; j++){
            for(int i=1; i<=9; i++){
                System.out.println(j + " * " + i + " = " + (j*i));
            }
            System.out.println();
        }
    }
}

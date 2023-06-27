package 섹션6.예외처리;

public class Exception1 {
    public static void main(String[] args){
        ExceptionObj1 exobj = new ExceptionObj1();
        try{
            int value = exobj.divide(10, 0);
            System.out.println(value);
        }catch(ArithmeticException ex){
            System.out.println("0으로 나눌 수 없어요.");

        }
    }
}

class ExceptionObj1{
    /**
     * i를 k로 나눈 나머지를 반환한다.
     * @param i
     * @param k
     * @return
     * @throws ArithmeticException
     */
    public int divide(int i, int k) throws ArithmeticException{
        int value = 0;
//        try{
//            value = i / k;
//        }catch(ArithmeticException ex){
//            System.out.println("0으로 나눌 수 없어요.");
//            System.out.println(ex.toString()); // ArithmeticException: / by zero
//        }

        value = i / k;

        return value;
    }
}

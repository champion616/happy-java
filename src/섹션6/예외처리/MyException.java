package 섹션6.예외처리;

public class MyException extends RuntimeException{
    // 오류 메시지나, 발생한 Exception을 감싼 결과로 내가 만든 Exception을 사용하는 경우가 많다.

    public MyException(String message) {
        super(message);
    }

//    public MyException(Throwable cause) {
    public MyException(Exception cause) {
        super(cause);
    }
}

package 섹션4.객체지향문법3;

/*
1. 1~45까지 써있는 Ball들을 로또 기계에 넣는다.
2. 로또 기계에 있는 Ball들을 섞는다.
3. 섞인 Ball들 중에서 6개를 꺼낸다.
 */
public interface LottoMachine {
    public static final int MAX_BALL_COUNT = 45; // public static final 생략 가능
    int RETURN_BALL_COUNT = 6;
    public abstract void setBalls(Ball[] balls); // abstract 생략 가능
    public void mix(); // 자기가 가지고 있는 Ball들을 섞는다.
    public Ball[] getBalls(); // 6개의 Ball을 반환한다.

}



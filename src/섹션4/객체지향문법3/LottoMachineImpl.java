package 섹션4.객체지향문법3;

import 섹션3.객체지향문법2.Parent;

// 인터페이스를 구현하게 되면 반드시 인터페이스가 가지고 있는 메소드를 오버라이딩 해야한다.
public class LottoMachineImpl implements LottoMachine {
    private Ball[] balls;

    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }

    // Math.random() ==> 0.0 <= x < 1.0     0.52343233
    //                  0.0 <= x < 45.0
    //            (int) 0 <= x < 45    0 ~ 44

    @Override
    public void mix() {
        for(int i=0; i<10000; i++){
            int x1 = (int)(Math.random() * LottoMachine.MAX_BALL_COUNT);
            int x2 = (int)(Math.random() * LottoMachine.MAX_BALL_COUNT);
            if(x1 != x2){
                Ball temp = balls[x1];
                balls[x1] = balls[x2];
                balls[x2] = temp;
            }
        }
    }

    @Override
    public Ball[] getBalls() {
        Ball[] result = new Ball[LottoMachine.RETURN_BALL_COUNT];
        for(int i=0; i<6; i++){
            result[i] = balls[i];
        }
        return result;
    }
}

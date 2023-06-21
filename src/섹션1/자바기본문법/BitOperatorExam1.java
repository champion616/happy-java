package 섹션1.자바기본문법;

public class BitOperatorExam1 {
    public static void main(String[] args) {
        int a = 4;
        int b = a >> 1; // 2^1으로 나눈다.
        System.out.println(b);

        int c = 4;
        int d = c << 1; // 2^1으로 곱한다.
        System.out.println(d);
    }
}

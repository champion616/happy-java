package 섹션4.객체지향문법3;

public class MyRunnableMain2 {
    public static void main(String[] args) {
//        MyRunnable r = new MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println("hello!!!");
//            }
//        };

        RunnableExecute runnableExecute = new RunnableExecute();
//        runnableExecute.execute(r);

//        runnableExecute.execute(new MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println("hello!!!");
//            }
//        });

        runnableExecute.execute(() -> {
                System.out.println("hello!!!");
            }
        );
    }
}

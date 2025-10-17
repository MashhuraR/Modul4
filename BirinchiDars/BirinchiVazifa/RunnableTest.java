package BirinchiDars.BirinchiVazifa;

public class RunnableTest {
    public static void main(String[] args) {
        Runnable runnable=()->{
            for (int i = 0; i < 7; i++) {
                System.out.println(Thread.currentThread().getName()+"->"+i);
            }
        };
        new Thread(runnable,"MyTest").start();

    }
}

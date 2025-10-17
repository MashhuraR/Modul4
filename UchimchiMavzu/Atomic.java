package UchimchiMavzu;
import java.util.concurrent.atomic.AtomicInteger;
public class Atomic {
    public static void main(String[] args) throws InterruptedException {
        var counter=new AtomicInteger(10);
        Runnable runnable=()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread()+"::"+counter.incrementAndGet());
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread()+"::"+counter.decrementAndGet());
            }
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable, "th" + i);
            threads[i].start();
            threads[i].join();
        }

    }
}

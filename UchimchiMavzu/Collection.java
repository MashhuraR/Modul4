package UchimchiMavzu;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class Collection {
    public static void main(String[] args) throws InterruptedException {
        var set= ConcurrentHashMap.<Integer>newKeySet();
        Runnable runnable=()->{
            for (int i = 0; i < 100; i++) {
                set.add(i);
            }

        };
        Runnable runnable2=()->{
            for (int i = 100; i < 200; i++) {
                set.add(i);
            }

        };
        new Thread(runnable).start();
        new Thread(runnable2).start();
        TimeUnit.SECONDS.sleep(2);
        System.out.println(set.size());

    }
}

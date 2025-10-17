package TortinchiMavzu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(5);
        for (int j = 0; j < 5; j++) {
            executor.execute(() -> {
                int sum = 0;
                for (int i = 0; i < 10; i++) {

                        sum += i;
                        System.out.println(Thread.currentThread() + "::" + sum);
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                }
            });
        }
        executor.shutdown();
    }
}

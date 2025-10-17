package TortinchiMavzu;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(2);

        Future<Boolean>f1=service.submit(()->{
            try {
                Thread.sleep(100);
                return true;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(f1.get());
        if(f1.get()){
            System.out.println("Callable.........");
        }
        service.shutdown();
    }
}

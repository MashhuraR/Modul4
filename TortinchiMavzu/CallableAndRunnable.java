package TortinchiMavzu;
import java.util.concurrent.*;
public class CallableAndRunnable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int a = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(a);
        System.out.println("Protsessor soni:"+a);
        long begin=System.currentTimeMillis();
        executeCallableTasks(executor);
        executeRunnableTasks(executor);
        long end=System.currentTimeMillis();
        System.out.println("Umumiy vaqt:"+(end-begin));
        executor.shutdown();
    }
    private static void executeCallableTasks(ExecutorService executor) throws ExecutionException, InterruptedException {
        Future<String> f1 = executor.submit(callableTask("1"));
        Future<String> f2 = executor.submit(callableTask("2"));
        System.out.println(f1.get());
        System.out.println(f2.get());
    }
    private static void executeRunnableTasks(ExecutorService executor) throws ExecutionException, InterruptedException {
        Future<?> f1 = executor.submit(runnableTask("1"));
        Future<?> f2 = executor.submit(runnableTask("2"));
        f1.get();
        f2.get();
    }
    private static Callable<String> callableTask(String name) {
        return () -> {
            Thread.sleep(100);
            return "Callable "  +name+ " ishladi ✅";
        };
    }
    private static Runnable runnableTask(String name) {
        return () -> {
            try {
                Thread.sleep(100);
                System.out.println(name+"Runnable ishladi......");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };
    }
}

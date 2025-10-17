package TortinchiMavzu;

import java.util.concurrent.*;

public class CallableOverload {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int a = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(a);
        System.out.println("Protsessor soni:"+a);
        long begin=System.currentTimeMillis();
        executeCallableTasks(executor);
        long end=System.currentTimeMillis();

        System.out.println("Umumiy vaqt:"+(end-begin));

        executor.shutdown();
    }
    private static void executeCallableTasks(ExecutorService executor) throws ExecutionException, InterruptedException {
        Future<String> f1 = executor.submit(callableTask("1"));
        Future<String> f2 = executor.submit(callableTask("2",150));
        System.out.println(f1.get());
        System.out.println(f2.get());
        if (f1.isDone()) {
            System.out.println("✅ Callable 1 bajarildi: " + f1.get());
        }
        if (f2.isDone()) {
            System.out.println("✅ Callable 2 bajarildi: " + f2.get());
        }

    }

    private static Callable<String> callableTask(String name) {
        return () -> {
            Thread.sleep(100);
            return "Callable "  +name+ " ishladi ✅";
        };
    }
    private static Callable<String> callableTask(String name,int time) {
        return () -> {
            Thread.sleep(time);
            return "Callable "  +name+ " ishladi ✅";
        };
    }

}

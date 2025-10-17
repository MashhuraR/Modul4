package TortinchiMavzu;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.*;
public class ThreadLocalTest {
    private static final ThreadLocal<SimpleDateFormat> formatThreadLocal=new ThreadLocal<>(){
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss.SSS");
        }
    };
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        try {
            for (int i = 0; i < 100; i++) {
                int finalI = i;
                service.execute(() -> {
                    info(new Date(), finalI);
                });
            }
        } finally {
            service.shutdown();
        }
    }
    static void info(Date data,int i){
        SimpleDateFormat simpleDateFormat=formatThreadLocal.get();
        String str=simpleDateFormat.format(data);
        System.out.println(Thread.currentThread().getName()+": User"+i+str);
    }
}

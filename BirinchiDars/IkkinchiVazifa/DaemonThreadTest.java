package BirinchiDars.IkkinchiVazifa;
public class DaemonThreadTest {
    public static void main(String[] args) {
        Runnable runnable=()->{
            for (int i = 0; i < 20; i++) {
                try {
                    System.out.println(Thread.currentThread().getName()+"->"+i);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }}
        };
        Runnable runnable2=()->{
            for (int i = 0; i < 20; i++) {
                try {
                    System.out.println(Thread.currentThread().getName()+"->"+i);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }}
        };
       var th= new Thread(runnable,"MyDaemonThreadTest");
       var th2= new Thread(runnable2,"MyDaemonThreadTest2");
        try {
            th2.join();
        } catch (InterruptedException e) {}
        th.setDaemon(true);
        th.start();
        th2.start();
        System.out.println("Hello,Mashhura");
        try {
            System.out.println(Thread.activeCount());
            Thread.sleep(250);
        } catch (InterruptedException e) {}
        th.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(7);
    }
}

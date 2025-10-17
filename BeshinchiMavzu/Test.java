package BeshinchiMavzu;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool pool=new ForkJoinPool(3);
        pool.submit(()->{
            for (int i = 0; i < 3; i++) {
                pool.execute(()->{
                Foydalanuvchi foydalanuvchi=Foydalanuvchi.getInstance();
                foydalanuvchi.information("Singleton");
                });
            }
        });
        pool.shutdown();
        pool.awaitTermination(3, TimeUnit.SECONDS);
    }

    private static class Foydalanuvchi{
        private static Foydalanuvchi info;

        public Foydalanuvchi() {
            System.out.println("Administrator ishlayapti...");
        }
        public static Foydalanuvchi getInstance() {
            if (info == null) {
                synchronized (Foydalanuvchi.class) {
                    if (info == null) {
                        info = new Foydalanuvchi();
                    }
                }
            }
            return info;
        }
        public void information(String son) {
            System.out.println(Thread.currentThread().getName() + " → " + son);
        }
    }
}

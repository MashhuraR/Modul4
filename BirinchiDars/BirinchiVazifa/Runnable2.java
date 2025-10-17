package BirinchiDars.BirinchiVazifa;

public class Runnable2 {
    public static void main(String[] args) {
        Thread thread=new Thread(new MyRunnable2());
        thread.start();
    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

              if(i==3) {
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
              }
            System.out.println(Thread.currentThread().getName()+"->"+i);
        }
    }
}
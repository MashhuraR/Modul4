package BirinchiDars.BirinchiVazifa;

public class Test {
    public static void main(String[] args) {
        MyTask myTask=new MyTask();
        myTask.start();
        System.out.println(Thread.activeCount());
    }

}
class MyTask extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"->"+i);
        }
    }
}
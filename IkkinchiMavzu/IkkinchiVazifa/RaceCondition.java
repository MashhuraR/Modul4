package IkkinchiMavzu.IkkinchiVazifa;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();
       var thread1=new Thread(()->{
           for (int i=0;i<10000;i++){
               counter.orttirish();
       }


        });
       var thread2=new Thread(()->{
           for (int i=0;i<10000;i++){
               counter.orttirish();
       }

        });
thread1.start();
thread2.start();

thread1.join();
thread2.join();

        System.out.println("Natija:"+counter.son);

    }

}
class Counter{
    int son=0;


    public void orttirish(){
        son++;
    }
}
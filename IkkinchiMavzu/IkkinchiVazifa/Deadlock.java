package IkkinchiMavzu.IkkinchiVazifa;

public class Deadlock {
    static class A{
        synchronized void methodA(B b){
            try {
                Thread.sleep(1000);
            }catch (Exception e){}

          b.last();
        }synchronized void last() {
            System.out.println("B.last()");
        }
    }
    static class B{
        synchronized void methodB(A a){
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
            a.last();
        }

        synchronized void last() {
            System.out.println("a.last()");
        }
    }
    static class DeadlockExample implements Runnable {
        A a = new A();
        B b = new B();

        public DeadlockExample() {
            Thread t = new Thread(this, "Thread-1");
            t.start();
            a.methodA(b);
        }

        public void run() {
            b.methodB(a);
        }
    }

    public static void main(String[] args) {
        new DeadlockExample();
    }
}

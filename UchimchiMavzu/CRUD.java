package UchimchiMavzu;
import java.util.ArrayList;
import java.util.Collections;
public class CRUD {
    public static void main(String[] args) {
        var arr1=new ArrayList<String>();
        var arr= Collections.synchronizedList(arr1);
        Runnable runnable=()->{

            for (int i = 0; i < 10; i++) {
                arr.add("Ali"+i);
            }
            for (int i = 5; i < 10; i++) {
                arr.set(i,"Soli"+i);
            }
            for (int i = 0; i < 10; i++) {
                arr.remove("Ali"+i);
            }
            synchronized (arr) {
                for (String x : arr) {
                System.out.println(x);
                }
            }
        };
        new Thread(runnable,"th1").start();
        new Thread(runnable,"th2").start();
    }
}

package IkkinchiMavzu.IkkinchiVazifa;

public class VolatileTest {
   volatile boolean field=false;
    public void writer(){
        field=true;
    }
    public void reader(){
        while (!field){

            System.out.println("trueee");

        }
        System.out.println("field o'zgardi");
    }

}

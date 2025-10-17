package IkkinchiMavzu.IkkinchiVazifa;

public class Test {
    public static void main(String[] args) {
        VolatileTest volatileTest=new VolatileTest();
        var th1=new Thread(volatileTest::writer);
        var th2=new Thread(volatileTest::reader);
        th1.start();
        th2.start();
    }

}

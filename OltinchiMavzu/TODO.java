package OltinchiMavzu;
import java.time.LocalTime;

public class TODO {
    public static void main(String[] args) throws InterruptedException {
while (true){
    LocalTime localTime=LocalTime.now().withNano(0);
    String time1="08:00:00";
    String time4="12:00:00";
    String time2="09:00:00";
    String time3="11:00:00";
    LocalTime localTime1=LocalTime.parse(time1);
    LocalTime localTime2=LocalTime.parse(time2);
    LocalTime localTime3=LocalTime.parse(time3);
    LocalTime localTime4=LocalTime.parse(time4);
    if(localTime1.equals(localTime)){
        System.out.println("Uyg'onish vaqti bo'ldi");
    }
    if(localTime.equals(localTime2)){
        System.out.println("HTML ishlash vaqti bo'ldi");
    }
    if(localTime.equals(localTime3)){
        System.out.println("CSS ishlash vaqti bo'ldi");
    }
    if(localTime.equals(localTime4)){
        System.out.println("Tushlik vaqti bo'ldi");
    }
Thread.sleep(1000);

    }
    }
}

package OltinchiMavzu;

import java.time.LocalTime;

public class TimeNow {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            LocalTime now = LocalTime.now();
            System.out.println("Hozirgi vaqt: " + now);
            Thread.sleep(60000);
        }
    }
}

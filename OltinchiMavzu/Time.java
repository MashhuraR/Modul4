package OltinchiMavzu;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
time();
date();
timeAndDate();
zoneId();
ZonedTime();
instant();
formattedTime();

    }
    public static void time(){
        LocalTime localTime=LocalTime.now();
        System.out.println("Hozirgi vaqt:"+localTime);
    }
    public static void date(){
        LocalDate localDate=LocalDate.now();
        System.out.println("Hozirgi sana:"+localDate);
    }
    public static void timeAndDate(){
        LocalDateTime localTime=LocalDateTime.now();
        System.out.println("Hozirgi vaqt va sana:"+localTime);
    }
    public static void ZonedTime(){
       ZonedDateTime zonedTime=ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println("Hozirgi vaqt va sana(London):"+zonedTime);
    }
    public static void instant() {
        Instant instant = Instant.now();
        System.out.println("Instant (UTC vaqt): " + instant);
    }
    public static void formattedTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatlangan vaqt: " + now.format(formatter));
    }
    public static void zoneId() {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println("Joriy zona: " + zone);
    }
}

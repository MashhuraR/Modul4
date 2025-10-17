package OltinchiMavzu;

import java.time.LocalDate;

public class DateTest {
        public static LocalDate convertToDate(String text) {
            return LocalDate.parse(text);
        }

        public static void main(String[] args) {
            String sana = "2025-10-14";
            LocalDate localDate = convertToDate(sana);
            System.out.println("String dan LocalDate: " + localDate);
        }
}

package OltinchiMavzu;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Simple {
    public static void main(String[] args) throws ParseException {
        String sana = "14-10-2025 07:43:25";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        Date date = sdf.parse(sana);
        System.out.println("Matndan Date: " + date);
    }
}

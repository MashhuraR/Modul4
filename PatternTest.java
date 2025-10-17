import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("[0-9]");
        Scanner scanner=new Scanner(System.in);
        String matn=scanner.nextLine();
        Matcher matcher= pattern.matcher(matn);
        int soni=0;
        while (matcher.find()){
            soni++;
        }
        System.out.println("Raqamlar soni:"+soni);
    }
}

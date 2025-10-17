package YettinchiMavzu;

import java.io.*;

public class IOTest {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("input.txt");
            FileWriter writer = new FileWriter("output.txt");

            int data;
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }

            reader.close();
            writer.close();
            System.out.println("Fayl nusxalandi!");
        } catch (IOException e) {}
    }
}


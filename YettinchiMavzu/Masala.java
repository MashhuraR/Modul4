package YettinchiMavzu;

import java.io.*;

public class Masala {
    public static void main(String[] args) throws IOException {
        faylgaYozish();
        faylniOqish();
    }

    private static void faylniOqish() throws IOException {
        BufferedReader ex1=new BufferedReader(new FileReader("example.txt"));
        System.out.println(ex1.readLine());
        ex1.close();
    }

    private static void faylgaYozish() throws IOException {
        BufferedWriter ex=new BufferedWriter(new FileWriter("example.txt"));
        ex.write("I'm learning Java");
        ex.newLine();
        ex.close();
    }
}

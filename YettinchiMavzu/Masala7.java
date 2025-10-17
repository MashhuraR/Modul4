package YettinchiMavzu;

import java.io.*;

public class Masala7 {
        public static void main(String[] args) throws IOException {
            File file=new File("examle7.txt");
            faylgaYozish(file);
            File file2=new File("examle.txt");
            faylgaYozish(file,file2);
            faylniOqish(file2);
        }
        private static void faylniOqish(File file) throws IOException {
            FileReader ex1=new FileReader(file);
            BufferedReader br = new BufferedReader(ex1);
            String matn;
            while ((matn = br.readLine()) != null) {
                System.out.println(matn);
            }
            br.close();
        }
        private static void faylgaYozish(File file) throws IOException {
            FileWriter ex=new FileWriter(file);
            ex.write("I'm learning Java and Python.\n");
            ex.close();
        }
        private static void faylgaYozish(File file,File file1) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file1));
            String satr;
            while ((satr = reader.readLine()) != null) {
                writer.write(satr);
                writer.newLine();
            }
            reader.close();
            writer.close();
        }
}

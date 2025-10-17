package YettinchiMavzu;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        Employee2 employee=new Employee2("Mashhura","19");
        try{
            FileOutputStream fos = new FileOutputStream("misol/example");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(employee);

            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileInputStream fis = new FileInputStream("misol/example");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee2 employee1 = (Employee2) ois.readObject();
            ois.close();
            fis.close();

            System.out.println(" Fayldan obyekt o‘qildi!");
            System.out.println(employee1);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

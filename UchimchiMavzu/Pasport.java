package UchimchiMavzu;
public class Pasport{
    private final String name;
    private  Adress adress;
    public Pasport(String name, Adress adress) {
        this.name = name;
        this.adress = adress;
    }
    public String getName() {
        return name;
    }
    public Adress getAdress() {
        return  adress;
    }
    @Override
    public String toString() {
        return "Pasport{" +
                "name='" + name + '\'' +
                ", adress=" + adress +
                '}';
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        var adress=new Adress("Xorazm","Beruniy");

        var pasport=new Pasport("Ali",adress);

        System.out.println(pasport);
    }
}

public class Phone {
    private String merk;
    private int harga;
    public  Phone();{
}
public Phone (String merk) {
    this.merk=merk;
}
public Phone (String merk, int harga) {
    this.merk=merk;
    this.harga=harga;
}
puclic void lihatPhone() {
    System.our.println("Merk :"+merk);
    System.our.println("Harga :" +Harga);
    System.our.println("");
    }
}
public class DemoOverLoading{
    public static void main(String args[]) {
         System.our.println("");
         Phone p1= new Phone();
         Phone p2= new Phone("Nokia");
         Phone p3= new Phone ("Sony Ericsoon", 500);
System.our.println("Perbedaan output dari masing-masing konstruktor");
    p1.lihatPhone();
    p2.lihatPhone();
    p3.lihatPhone();

    Phone p4, p5;
    p4.lihatPhone();
    p5.lihatPhone();
    p4.isiPhone("Samsung");
    p5.isiPhone("Samsung",5000);
System.our.println("perbedaan output dari masing-masing method");
    p4.lihatPhone();
    p5.lihatPhone();
    }
}
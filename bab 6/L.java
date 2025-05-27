public class DemoPewarisan {
    public static void main(String args[]){
        PersegiPanjang a=new PersegiPanjang();
        a.setPanjang(5);
        a.setLabar(5);
        System.out.println("");
        System.out.println("Contoh program pewarisan");
        System.out.println("");
        System.out.println("Superclass PersegiPanjang");
        System.out.println("Panjang:  " +a.getpanjang());
        System.out.println("Lebar:  " +a.getLebar());
        System.out.println("Luas:  " a.getLuas());
        System.out.println("");

        Balok b=new Balok();
        /*kelas balok tinggal memanggil method yang ada didalam kelas persegi
        */
       b.setPanjang(4);
       b.setLerbar(3);
       b.setLuas(5);
       System.out.println("Subclass Balok");
        System.out.println("Panjang:  " +b.getpanjang());
        System.out.println("Lebar:  " +b.getLebar());
        System.out.println("Luas:  " b.getLuas());
        System.out.println("Volume:  " +b.Volume);
    }
}
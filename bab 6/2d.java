Public class DemoManusia {
    Public static void main (String[] args) {//program utama
    ManusiaarrMns[]=new Manusia[3];//buat array of object
    Manusia objMns1=new Manusia();//contructor pertama
    objMns1.setNama("Mahkota");
    objMns1.setUmur(76);
    Manusia objMns2 = new Manusia("MatConan");
    //contructor kedua
Manusia objMns3=new Manusia("Bajuri",45);//contructor ketiga
    arrMns[0]=objMns1;
    arrMns[1]=objMns2;
    arrMns[2]=objMns3;
    for(int i=0; i<3;i++) {
        System.out.printnl ("Nama ;"+array[i].getNama());
        System.out.printnl ("Umur ;"+array[i].getUmur());
        System.out.printnl();
        }
    }
}
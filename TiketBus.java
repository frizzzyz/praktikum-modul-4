package modul4;

public class TiketBus extends Tiket {
    public void pesan(String n) {
    this.namaPenumpang = n;
    this.tujuan = "Bandung";    
    this.jarakTempuh = 150;     
    this.hargaTiket = 85000;    
}
//Maulana Ilham Al Amin
//25515040711109
@Override
public void pesan() {
this.tujuan = "Bandung";
}
@Override
public void pesan(String n, String t) {
if (t.equals("Makassar")) {
this.tujuan = "Makassar";
System.out.println("Maaf " + n + ", tiket tidak dapat dipesan.");
}
}
@Override
public void tampil() {
if (!this.tujuan.equals("Makassar")) {
super.tampil();
} else {
System.out.println("Tiket tujuan Makassar tidak tersedia.");
System.out.println("--------------------");
}

}

}



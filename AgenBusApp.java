package modul4;
public class AgenBusApp {
public static void main(String[] args) {
Tiket t1 = new Tiket();
t1.pesan();
t1.tampil();
TiketBus t2 = new TiketBus();
t2.pesan();
t2.tampil();
TiketBus t3 = new TiketBus();
t3.pesan("Kasino", "Bandung", 650, 450000);
t3.tampil();
t1.pesan("Indro", "Makassar");
t1.tampil();
t2.pesan("Dono", "Makassar");
t2.tampil();
TiketBus t5 = new TiketBus();
t5.pesan("Budi");
t5.tampil();
TiketBus t4 = new TiketBus() {
    @Override
    public void tampil() {
        System.out.println("===== DETAIL TIKET =====");
        System.out.println("Nama    : " + this.namaPenumpang);
        System.out.println("Tujuan  : " + this.tujuan);
        System.out.println("Harga   : " + this.hargaTiket);
        System.out.println("========================");
    }
};
t4.pesan("Ilham", "Bandung", 700, 500000);
t4.tampil();
}
//Maulana Ilham Al Amin
//25515040711109

}

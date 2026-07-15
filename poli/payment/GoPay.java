package modul4.poli.payment;

public class GoPay extends Payment {
    @Override
    public void process(double amount) {
        System.out.println("Deducting Rp" + amount + " from GoPay balance.");
    }
}

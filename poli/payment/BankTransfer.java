package modul4.poli.payment;

public class BankTransfer extends Payment {
    @Override
    public void process(double amount) {
        System.out.println("Transferring Rp" + amount + " via bank.");
    }
}

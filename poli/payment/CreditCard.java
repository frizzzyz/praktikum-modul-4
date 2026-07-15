package modul4.poli.payment;

public class CreditCard extends Payment {
    @Override
    public void process(double amount) {
        System.out.println("Charging Rp" + amount + " to credit card.");
    }
}

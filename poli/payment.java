package modul4.poli;

public class Payment {
    public void process(double amount) {}
}

public class CreditCard extends Payment {
    @Override
    public void process(double amount) {
        System.out.println("Charging Rp" + amount + " to credit card.");
    }
}

public class GoPay extends Payment {
    @Override
    public void process(double amount) {
        System.out.println("Deducting Rp" + amount + " from GoPay balance.");
    }
}

public class BankTransfer extends Payment {
    @Override
    public void process(double amount) {
        System.out.println("Transferring Rp" + amount + " via bank.");
    }
}

// Penggunaan polimorfis:
Payment method = new GoPay();   // bisa diganti CreditCard / BankTransfer
method.process(150000);

package modul4.poli.payment;

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


Payment method = new GoPay(); 
method.process(150000);
//Maulana Ilham Al Amin
//255150407111099
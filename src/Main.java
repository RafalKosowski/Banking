import banking.*;

public class Main {

    public static void main(String[] args) {

        Customer klient1 = new Customer("Raf","Kos");
       // Account konto1= new Account(500.0);
        klient1.setAccount(new Account(500.0));
        Account konto1 = klient1.getAccount();
        konto1.withdraw(150);
        konto1.deposit(22.50);
        konto1.withdraw(47.62);

        System.out.println("osoba: " + klient1.getFirstName()+ " "+ klient1.getLastName());
        System.out.println("Stan konta: " + konto1.getBalance());
    }
}

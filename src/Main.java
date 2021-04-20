import banking.*;

public class Main {

    public static void main(String[] args) {

        Customer [] klient= new Customer[100];
        klient[0]=new Customer("Jan","Kowalski");
        klient[0].addAccount(new Account(200));
        klient[0].addAccount(new Account(500));
        klient[1]=new Customer("Paweł","Kowalski");
        klient[1].addAccount(new Account(200));
        klient[2]=new Customer("Jan","Nowak");
        klient[2].addAccount(new Account(1500));
        klient[3]=new Customer("Mateusz","Nowakowski");
        klient[3].addAccount(new Account(200));
        klient[3].addAccount(new Account(150));
        Bank klienci=new Bank(klient, 4);
        klienci.getCustomer(3).addAccount(new Account(2000000));
        // problem z dodaniem konta
        klienci.addCustomer("Mat","Kosowski");
        klienci.getCustomer(4).addAccount(new Account(200));

        for (int i = 0; i < klienci.getNumberOfCustomers(); i++) {
            System.out.println("Osoba "+i+":  "+klienci.getCustomer(i).getFirstName()+" "+klienci.getCustomer(i).getLastName());
            for (int j = 0; j < klient[i].getNumberOfAccounts(); j++) {
                System.out.println("    Konto "+j+": "+ klient[i].getAccount(j).getBalance());
            }

        }
    }
}

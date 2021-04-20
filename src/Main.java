import banking.*;

public class Main {

    public static void main(String[] args) {

        Customer [] klient= new Customer[100];
        klient[0]=new Customer("Jan","Kowalski");
        klient[1]=new Customer("Paweł","Kowalski");
        klient[2]=new Customer("Jan","Nowak");
        klient[3]=new Customer("Mateusz","Nowakowski");
        klient[4]=new Customer("Jacek","Nowak");
        Bank klienci=new Bank(klient, 5);
        klienci.addCustomer("Rafał","Kosowski");

        for (int i = 0; i < klienci.getNumberOfCustomers(); i++) {
            System.out.println("Osoba "+i+":  "+klienci.getCustomer(i).getFirstName()+" "+klienci.getCustomer(i).getLastName());
        }
    }
}

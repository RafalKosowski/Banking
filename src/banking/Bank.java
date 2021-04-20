package banking;

public class Bank {
    private int numberOfCustomers;
    protected Customer [] customers = new Customer[100];

    public Bank(Customer[] cus, int howMany) {
        System.arraycopy(cus, 0, customers, 0, howMany);
        numberOfCustomers=howMany;
    }
    public void addCustomer(String f,String l){
        customers[numberOfCustomers]=new Customer(f,l);
        numberOfCustomers++;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
       return customers[index];
    }
}

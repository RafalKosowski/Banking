package banking;

public class Customer {

    private String firstName;
    private String lastName;
    private  int numberOfAccounts=0;
    private Account [] accounts = new Account[20];

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account account){
        accounts[numberOfAccounts]=account;
        numberOfAccounts++;
    }

    public Account getAccount(int index){
        return accounts[index];
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }
}

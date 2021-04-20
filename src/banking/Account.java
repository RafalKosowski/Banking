package banking;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public boolean deposit(double amt){
        //wpłać
        if (amt>0){
            balance=balance+amt;
            return true;
        }

        return false;

    }
    public boolean withdraw(double amt){
        //wypłać
        if (amt<balance){
            balance=balance-amt;
            return true;
        }

        return false;

    }
}

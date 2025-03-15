public class NegativeBalanceExcetpion extends Exception {
    public NegativeBalanceExcetpion(String message) {
        super(message);
    }
    
}

class BankAccount{
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount) throws NegativeBalanceExcetpion {
        if (balance - amount < 0) {
            throw new NegativeBalanceExcetpion("Tnsufficient funds to withdraw" + "dollars.");
        } else {
            balance -= amount;
        }
    }
}

class UserDefinedException {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(100);

        try {
            ba.withdraw(200);
        } catch (NegativeBalanceExcetpion ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Remaining balance: " + ba.getBalance());
    }
}
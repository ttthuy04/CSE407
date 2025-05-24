public class SavingsAccount extends Account {
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
    }

    public void operation() {
        System.out.println("Savings account specific operation.");
    }
}
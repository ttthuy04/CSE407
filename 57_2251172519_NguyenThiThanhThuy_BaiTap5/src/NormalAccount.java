public class NormalAccount extends Account {
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance in Normal Account");
        }
    }
}
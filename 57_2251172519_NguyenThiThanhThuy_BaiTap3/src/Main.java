public class Main {
    public static void main(String[] args) {
        AccountFactory factory = new SavingsAccountFactory();
        Account acc = factory.createAccount(500);
        acc.withdraw(450);
    }
}

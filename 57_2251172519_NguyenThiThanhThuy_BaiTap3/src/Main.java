public class Main {
    public static void main(String[] args) {
        AccountFactory savingsFactory = new SavingsAccountFactory();
        AccountFactory normalFactory = new NormalAccountFactory();
        AccountFactory vipFactory = new VipAccountFactory();

        Account savings = savingsFactory.createAccount(500);
        Account normal = normalFactory.createAccount(300);
        Account vip = vipFactory.createAccount(200);

        System.out.println("\n--- SavingsAccount ---");
        savings.withdraw(450);
        savings.withdraw(300);

        System.out.println("\n--- NormalAccount ---");
        normal.withdraw(350);
        normal.withdraw(150);

        System.out.println("\n--- VIPAccount ---");
        vip.withdraw(600);
        vip.withdraw(200);
    }
}

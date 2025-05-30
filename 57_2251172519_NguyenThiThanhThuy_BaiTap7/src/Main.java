public class Main {
    public static void main(String[] args) {
        Account savingAccount = new Account(new SavingAccount(), 2000) {

        };
        savingAccount.deposit(500);
        System.out.println("Tien lai: " + savingAccount.calculateInterest());
        savingAccount.withdraw(200);
        System.out.println();

        Account normalAccount = new Account(new NormalAccount(), 1000) {
        };
        normalAccount.deposit(500);
        System.out.println("Tien lai: " + normalAccount.calculateInterest());
        normalAccount.withdraw(200);
    }
}
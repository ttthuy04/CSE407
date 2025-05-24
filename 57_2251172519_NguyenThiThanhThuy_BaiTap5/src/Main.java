public class Main {
    public static void main(String[] args) {
        AccountBuilder normalBuilder = new NormalAccountBuilder();
        AccountDirector director = new AccountDirector(normalBuilder);

        Account normal = director.make("normal");
        System.out.println("Normal Account Balance: " + normal.getBalance());

        AccountBuilder savingsBuilder = new SavingsAccountBuilder();
        director.changeBuilder(savingsBuilder);

        Account savings = director.make("savings");
        System.out.println("Savings Account Balance: " + savings.getBalance());
    }
}

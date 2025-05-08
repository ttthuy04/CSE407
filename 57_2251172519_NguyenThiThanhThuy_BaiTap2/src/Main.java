public class Main {
    public static void main(String[] args) {
        SavingsAccount savAcc = new SavingsAccount(500);
        savAcc.withdraw(300);
        savAcc.withdraw(300);
        System.out.println("So du cuoi cung cua ban la: " + savAcc.getBalance());
    }
}
public class Main {
    public static void main(String[] args) {
        AccountBuilder normalBuilder = new NormalAccountBuilder();
        AccountBuilder savingsBuilder = new SavingsAccountBuilder();

        AccountDirector director = new AccountDirector(normalBuilder);
        NormalAccount normal = (NormalAccount) director.make("normal");
        System.out.println("So du cuoi cung cua tai khoan thuong la: " + normal.getBalance());

        director.changeBuilder(savingsBuilder);
        SavingsAccount savings = (SavingsAccount) director.make("savings");
        System.out.println("So du cuoi cung cua tai khoan tiet kiem: " + savings.getBalance());
    }
}
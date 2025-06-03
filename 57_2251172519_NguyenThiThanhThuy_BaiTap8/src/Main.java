public class Main {
    public static void main(String[] args) {

        AccountComponent account = new AccountComponent(null);
        WithdrawComponent withdraw = new WithdrawComponent(null);

        AccountMediator mediator = new AccountMediator(account, withdraw);

        account.updateBalance(1000);
        withdraw.withdraw(300);
        withdraw.withdraw(800);
    }
}
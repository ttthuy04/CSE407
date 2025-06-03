class AccountComponent {
    private IMediator mediator;
    private double balance;

    public AccountComponent(IMediator mediator) {
        this.mediator = mediator;
        this.balance = 0;
    }

    public void updateBalance(double amount) {
        this.balance += amount;
        System.out.println("Tai khoan da cap nhat. So du moi: " + balance);
        if (mediator != null) {
            mediator.notify(this, "BalanceUpdated");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }
}
class AccountMediator implements IMediator {
    private AccountComponent account;
    private WithdrawComponent withdraw;

    public AccountMediator(AccountComponent account, WithdrawComponent withdraw) {
        this.account = account;
        this.withdraw = withdraw;
        if (this.account != null) {
            this.account.setMediator(this);
        }
        if (this.withdraw != null) {
            this.withdraw.setMediator(this);
        }
    }

    @Override
    public void notify(Object sender, String ev) {
        if (ev.startsWith("Withdraw:")) {
            reactOnWithdraw(sender, ev);
        } else if (ev.equals("BalanceUpdated")) {
            reactOnBalanceUpdate();
        }
    }

    private void reactOnWithdraw(Object sender, String ev) {
        double amount = Double.parseDouble(ev.split(":")[1]);
        if (account != null && account.getBalance() >= amount) {
            account.updateBalance(-amount);
        } else {
            System.out.println("So du khong du de rut " + amount);
        }
    }

    private void reactOnBalanceUpdate() {
        if (account != null) {
            System.out.println("Mediator: So du da cap nhat. So du hien tai: " + account.getBalance());
        }
    }
}
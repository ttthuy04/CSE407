class WithdrawComponent {
    private IMediator mediator;

    public WithdrawComponent(IMediator mediator) {
        this.mediator = mediator;
    }

    public void withdraw(double amount) {
        System.out.println("Rut tien: " + amount);
        if (mediator != null) {
            mediator.notify(this, "Withdraw:" + amount);
        }
    }

    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }
}
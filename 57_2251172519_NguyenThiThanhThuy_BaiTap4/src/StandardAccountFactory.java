public class StandardAccountFactory implements AccountFactory {
    @Override
    public SavingsAccount createSavingsAccount(double balance) {
        return new ShortTermSavingsAccount(balance);
    }

    @Override
    public VipAccount createVipAccount(double balance) {
        return new GoldVipAccount(balance);
    }
}

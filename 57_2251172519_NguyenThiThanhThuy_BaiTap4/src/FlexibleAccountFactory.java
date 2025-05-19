public class FlexibleAccountFactory implements AccountFactory {
    @Override
    public SavingsAccount createSavingsAccount(double balance) {
        return new LongTermSavingsAccount(balance);
    }

    @Override
    public VipAccount createVipAccount(double balance) {
        return new PlatinumVipAccount(balance);
    }
}

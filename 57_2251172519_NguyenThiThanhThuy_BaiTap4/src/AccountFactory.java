public interface AccountFactory {
    SavingsAccount createSavingsAccount(double balance);
    VipAccount createVipAccount(double balance);
}

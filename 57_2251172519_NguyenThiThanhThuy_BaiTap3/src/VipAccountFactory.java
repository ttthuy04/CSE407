public class VipAccountFactory extends AccountFactory {
    @Override
    public Account createAccount(double balance) {
        return new VipAccount(balance);
    }
}
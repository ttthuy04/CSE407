public class VipAccountFactory extends AccountFactory {
    @Override
    public Account createAccount() {
        return new VipAccount(1500);
    }
}

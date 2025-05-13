public class NormalAccountFactory extends AccountFactory {
    @Override
    public Account createAccount(double balance) {
        return new NormalAccount(balance);
    }
}

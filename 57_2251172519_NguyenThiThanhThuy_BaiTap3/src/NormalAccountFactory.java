public class NormalAccountFactory extends AccountFactory {
    @Override
    public Account createAccount() {
        return new NormalAccount(500);
    }
}

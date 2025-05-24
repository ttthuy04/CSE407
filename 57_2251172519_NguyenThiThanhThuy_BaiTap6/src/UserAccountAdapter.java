public class UserAccountAdapter implements Account {
    private final UserAccount user;

    public UserAccountAdapter(UserAccount user) {
        this.user = user;
    }

    @Override
    public void access() {
        user.login();
    }
}

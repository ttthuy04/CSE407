public class AdminAccountAdapter implements Account {
    private final AdminAccount admin;

    public AdminAccountAdapter(AdminAccount admin) {
        this.admin = admin;
    }

    @Override
    public void access() {
        admin.adminAccess();
    }
}

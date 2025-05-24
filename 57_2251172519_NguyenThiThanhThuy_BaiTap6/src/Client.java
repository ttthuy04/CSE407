public class Client
{
    public static void Main(string[] args)
    {
        // Các đối tượng gốc
        UserAccount user = new UserAccount();
        AdminAccount admin = new AdminAccount();

        Account userAccount = new UserAccountAdapter(user);
        Account adminAccount = new AdminAccountAdapter(admin);

        Console.WriteLine("Khach hang dang truy cap tai khoan:");
        userAccount.Access();
        adminAccount.Access();
    }
}

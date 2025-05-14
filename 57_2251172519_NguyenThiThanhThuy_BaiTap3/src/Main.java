public class Main {
    public static void main(String[] args) {
        AccountFactory factory;

        factory = new VipAccountFactory();
        factory.withdraw(2000); // Cho phép rút vượt nếu chưa quá -200

        factory = new SavingsAccountFactory();
        factory.withdraw(400); // OK

        factory = new NormalAccountFactory();
        factory.withdraw(600); // Thất bại nếu vượt quá 500
    }
}

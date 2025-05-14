public class Main {
    public static void main(String[] args) {
        AccountFactory factory;

        factory = new VipAccountFactory();
        factory.withdraw(500, 100);

//        factory = new SavingsAccountFactory();
//        factory.withdraw(200, 500);
//
//        factory = new NormalAccountFactory();
//        factory.withdraw(100, 80);
    }
}

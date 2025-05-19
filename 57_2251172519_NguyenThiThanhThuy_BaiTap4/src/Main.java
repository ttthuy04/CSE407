public class Main {
    public static void main(String[] args) {
        // Sử dụng StandardAccountFactory
        AccountFactory factory1 = new StandardAccountFactory();
        SavingsAccount sa1 = factory1.createSavingsAccount(500);
        sa1.withdraw(200);

        VipAccount vip1 = factory1.createVipAccount(1000);
        vip1.withdraw(300);

        // Sử dụng FlexibleAccountFactory
        AccountFactory factory2 = new FlexibleAccountFactory();
        SavingsAccount sa2 = factory2.createSavingsAccount(400);
        sa2.withdraw(350);  // sẽ không được vì phải giữ lại >= 100

        VipAccount vip2 = factory2.createVipAccount(600);
        vip2.withdraw(650);  // không được vì không đủ tiền
    }
}

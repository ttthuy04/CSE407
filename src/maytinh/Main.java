package maytinh;

public class Main {
    public static void main(String[] args) {
        BoNho boNho = new BoNho("SSD", 512);
        MayTinh mayTinh = new MayTinh("Lenovo LOQ", boNho);
        mayTinh.hienThiThongTin();
    }
}

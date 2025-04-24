package maytinh;

public class MayTinh {
    private String ten;
    private BoNho boNho;

    public MayTinh(String ten, BoNho boNho) {
        this.ten = ten;
        this.boNho = boNho;
    }

    public void hienThiThongTin() {
        System.out.println("Tên máy tính: " + ten);
        System.out.println("Thông tin bộ nhớ: " + boNho.toString());
    }
}

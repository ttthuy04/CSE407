package maytinh;

public class MayTinh {
    private String ten;
    private BoNho boNho;

    public MayTinh(String ten, String loaiBoNho, int dungLuongBoNho) {
        this.ten = ten;
        this.boNho = new BoNho(loaiBoNho, dungLuongBoNho);
    }

    public void hienThiThongTin() {
        System.out.println("Tên máy tính: " + ten);
        System.out.println("Thông tin bộ nhớ: " + boNho.toString());
    }
}

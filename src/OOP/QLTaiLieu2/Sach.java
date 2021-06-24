package OOP.QLTaiLieu2;

public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach() {
        super();
    }

    public Sach(String tenTacGia, int soTrang) {
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach(String maTL, String tenNhaSanXuat, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTL, tenNhaSanXuat, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                ", maTL='" + maTL + '\'' +
                ", tenNhaSanXuat='" + tenNhaSanXuat + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}

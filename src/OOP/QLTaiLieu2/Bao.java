package OOP.QLTaiLieu2;

public class Bao extends TaiLieu{
    private int ngayPhatHanh;

    public Bao() {
        super();
    }

    public Bao(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(String maTL, String tenNhaSanXuat, int soBanPhatHanh, int ngayPhatHanh) {
        super(maTL, tenNhaSanXuat, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh=" + ngayPhatHanh +
                ", maTL='" + maTL + '\'' +
                ", tenNhaSanXuat='" + tenNhaSanXuat + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}

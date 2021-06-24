package OOP.QLTaiLieu2;

public class TaiLieu {
    protected String maTL;
    protected String tenNhaSanXuat;
    protected int soBanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(String maTL, String tenNhaSanXuat, int soBanPhatHanh) {
        this.maTL = maTL;
        this.tenNhaSanXuat = tenNhaSanXuat;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getTenNhaSanXuat() {
        return tenNhaSanXuat;
    }

    public void setTenNhaSanXuat(String tenNhaSanXuat) {
        this.tenNhaSanXuat = tenNhaSanXuat;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
}

package ucln.wicked.minions;

public abstract class Hinh {
    protected String mau;
    public Hinh(String mau) {
        this.mau = mau;
    }
    public abstract double TinhDienTich();
    public abstract double TinhChuVi();
    public abstract void VeHinh();
    public String LayThongTin() {
        return "Color: " + mau;
    }
}

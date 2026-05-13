package ucln.wicked.minions;
public class HinhChuNhat extends Hinh{
    protected double chieudai;
    protected double chieurong;
    public HinhChuNhat(String mau, double chieudai, double chieurong) {
        super(mau);
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
    @Override
    public double TinhDienTich() {
        return chieudai * chieurong;
    }
    @Override
    public double TinhChuVi() {
        return (chieudai + chieurong) * 2;
    }
    @Override
    public void VeHinh() {
        System.out.println("--- Draw Rectanngo ---");
        for (int i = 0; i < (int)chieurong; i++) {
            for (int j = 0; j < (int)chieudai; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    @Override
    public String LayThongTin() {
        return super.LayThongTin() + ", Hinh Chu Nhat (Dai: " + chieudai +
                ", Rong: " + chieurong + "), Dien tich: " + TinhDienTich() +
                ", Chu vi: " + TinhChuVi();
    }
}

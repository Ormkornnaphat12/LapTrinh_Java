package ucln.wicked.minions;

public class HinhTron extends Hinh{
    private double bankinh;
    public HinhTron(String mau, double bankinh) {
        super(mau);
        this.bankinh = bankinh;
    }
    @Override
    public double TinhDienTich() {
        return Math.PI * bankinh * bankinh;
    }
    @Override
    public double TinhChuVi() {
        return 2 * Math.PI * bankinh;
    }
    @Override
    public void VeHinh() {
        System.out.println("--- Vẽ Hình Tròn ---");
        double r = this.bankinh;
        for (double y = r; y >= -r; y--) {
            for (double x = -r; x <= r; x += 0.5) {
                if (x * x + y * y <= r * r) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    @Override
    public String LayThongTin() {
        return super.LayThongTin() + " | Circle (Ban kinh: " + bankinh +
                ") | DT: " + String.format("%.2f", TinhDienTich()) +
                " | CV: " + String.format("%.2f", TinhChuVi());
    }
}

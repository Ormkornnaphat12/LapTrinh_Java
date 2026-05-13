package ucln.wicked.minions;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong(String mau, double canh) {
        super(mau, canh, canh);
    }
    @Override
    public void VeHinh() {
        System.out.println("--- Draw square ---");
        for (int i = 0; i < (int)chieudai; i++) {
            for (int j = 0; j < (int)chieudai; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    @Override
    public String LayThongTin() {
        return "Color: " + mau + " | Square (Edge: " + chieudai +
                ") | DT: " + TinhDienTich() + " | CV: " + TinhChuVi();
    }
}
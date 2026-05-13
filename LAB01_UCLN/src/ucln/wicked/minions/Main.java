package ucln.wicked.minions;

public class Main {
    public static void main(String[] args) {
        Hinh hcn = new HinhChuNhat("Red", 5.0, 8.0);
        Hinh ht = new HinhTron("Blue", 3.5);
        Hinh hv = new HinhVuong("Yellow", 4.0);
        System.out.println("=== RESULT ===");
        System.out.println(hcn.LayThongTin());
        hcn.VeHinh();
        System.out.println();
        System.out.println(ht.LayThongTin());
        ht.VeHinh();
        System.out.println();
        System.out.println(hv.LayThongTin());
        hv.VeHinh();
    }

}

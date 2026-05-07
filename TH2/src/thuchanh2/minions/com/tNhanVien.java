package thuchanh2.minions.com;
import java.util.Scanner;
public class tNhanVien {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
        System.out.println("=== Nhan Vien 1 === ");
        System.out.print("Ho: "); String Ho1 = sc.nextLine();
        System.out.print("Ten: "); String Ten1 = sc.nextLine();
        System.out.print("So san pham: "); int pd1 = Integer.parseInt(sc.nextLine());
    nhanVien nv1 = new nhanVien(Ho1, Ten1, pd1);
        System.out.println("\n=== Nhan Vien 2 === ");
        System.out.print("Ho: "); String Ho2 = sc.nextLine();
        System.out.print("Ten: "); String Ten2 = sc.nextLine();
        System.out.print("So san pham: "); int pd2 = Integer.parseInt(sc.nextLine());
    nhanVien nv2 = new nhanVien(Ho2, Ten2, pd2);
        System.out.println("\n=== Luong ===");
        System.out.println(nv1.getTen() + ": " + nv1.getLuong());
        System.out.println(nv2.getTen() + ": " + nv2.getLuong());
        sc.close();
    }
}

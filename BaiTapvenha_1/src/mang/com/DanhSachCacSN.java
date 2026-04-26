package mang.com;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class DanhSachCacSN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String choice;
        do {
            System.out.println("\n---- MENU QUAN LY ----");
            System.out.println("1. Them vao danh sach.");
            System.out.println("2. Xuat danh sach.");
            System.out.println("3. Sua so theo gia tri");
            System.out.println("4. Xoa so theo gia tri");
            System.out.println("5. Tim kiem so.");
            System.out.println("6. Sap xep danh sach.");
            System.out.println("0. Thoat");
            System.out.print("Vui long nhap so de chon: ");

            String chon = sc.nextLine();

            switch (chon) {
                case "1":
                    System.out.print("Nhap so nguyen can them: ");
                    int soThem = Integer.parseInt(sc.nextLine());
                    list.add(soThem);
                    System.out.println("-- Da them thanh cong!");
                    break;

                case "2":
                    System.out.println("Danh sach hien tai: " + list);
                    break;

                case "3":
                    System.out.print("Nhap so cu can sua: ");
                    int soCu = Integer.parseInt(sc.nextLine());
                    if (list.contains(soCu)) {
                        System.out.print("Nhap so moi: ");
                        int soMoi = Integer.parseInt(sc.nextLine());
                        int index = list.indexOf(soCu);
                        list.set(index, soMoi);
                        System.out.println("-- Da sua thanh cong!");
                    } else {
                        System.out.println("--KHONG TIM THAY SO NAY!");
                    }
                    break;

                case "4":
                    System.out.print("Nhap so muon xoa: ");
                    int soXoa = Integer.parseInt(sc.nextLine());
                    if (list.remove(Integer.valueOf(soXoa))) {
                        System.out.println("-- Da xoa thanh cong!");
                    } else {
                        System.out.println("-- KHONG TIM THAY SO CAN XOA!");
                    }
                    break;

                case "5":
                    System.out.print("Nhap so can tim: ");
                    int soTim = Integer.parseInt(sc.nextLine());
                    if (list.contains(soTim)) {
                        System.out.println("So " + soTim + " da co trong danh sach.");
                    } else {
                        System.out.println("-- KHONG TIM THAY.");
                    }
                    break;

                case "6":
                    Collections.sort(list);
                    System.out.println("Da sap xep tang dan: " + list);
                    break;

                case "0":
                    System.out.println("BYE!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("SO KHONG HOP LE! VUI LONG NHAP LAI!!!!!!!!!");
            }
        } while (true);
    }
}


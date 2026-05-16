package cuahang.phancung.chatgpt;
import com.sun.net.httpserver.Authenticator;

import java.util.Scanner;
import java.util.ArrayList;

public class InvoiceTest {
    private static ArrayList<Invoice> listInvoices = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void createMockedData()
    {
        listInvoices.add(new Invoice("V01", "VANS CHECKERBOARD SLIP-ON CLASSIC BLACK/OFF WHITE", 10, 1305000));
        listInvoices.add(new Invoice("V02", "VANS SKATE LOAFER BLACK",  25, 1310000));
        listInvoices.add(new Invoice("N01", "NIKE DUNK LOW",50,3239000));
        listInvoices.add(new Invoice("N02", "NIKE DUNK LOW RETRO",2,2929000));
        listInvoices.add(new Invoice("N03", "NIKE AIR MAX 90 PREMIUM", 8,4109000));
        listInvoices.add(new Invoice("N04", "NIKE AIR FORCE 1",10, 2929000));
        listInvoices.add(new Invoice("N05", "NIKE CORTEZ LEATHER",18, 2499000));
        listInvoices.add(new Invoice("A01", "ADIDAS SAMBA OG", 9, 2700000));
        listInvoices.add(new Invoice("A02", "ADIDAS TENNIS COURT SPEC 2", 10, 1600000));
        listInvoices.add(new Invoice("NB01", "NEW BALANCE 530 UNISEX", 7, 2890000));
        System.out.println("=== Upload Successfull  ===");
    }
    public static void inputInvoice()
    {
        System.out.println("Nhap ma mat hang: ");
        String cd = sc.nextLine();
        for(Invoice iv: listInvoices )
        {
            if(iv.getPartNumber().equalsIgnoreCase(cd)) {
                System.out.println("Error: Da ton tai !");
                return;
            }
        }
        System.out.println("Nhap mo ta: ");
        String dsc = sc.nextLine();
        System.out.println("Nhap so luong: ");
        int qt = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gia ban: ");
        double pI = Double.parseDouble(sc.nextLine());
        listInvoices.add(new Invoice(cd, dsc, qt, pI));
        System.out.println("Them hoa don thanh cong!");
    }
    public static void outputList()
    {
        if(listInvoices.isEmpty())
        {
            System.out.println("DANH SACH TRONG!!!");
            return;
        }
        System.out.println("=====  DANH SACH HOA DON  =====");
        for (Invoice iv: listInvoices)
        {
            System.out.println(iv);
        }
    }
    public static void arrange_Number() {
        int n = listInvoices.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listInvoices.get(j).getPartNumber().compareToIgnoreCase(listInvoices.get(j + 1).getPartNumber()) > 0) {
                    Invoice temp = listInvoices.get(j);
                    listInvoices.set(j, listInvoices.get(j + 1));
                    listInvoices.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sap xep theo tang dan !");
    }
    public static void search_Number()
    {
        System.out.print("Nhap ma hang can tim: ");
        String cd = sc.nextLine();
        boolean found = false;
        for (Invoice in : listInvoices) {
            if (in.getPartNumber().equalsIgnoreCase(cd)) {
                System.out.println("--- RESULT ---");
                System.out.println(in);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found: " + cd);
        }
    }
    public static void del_Number() {
        System.out.print("Nhap ma hang muon xoa: ");
        String cd = sc.nextLine();
        boolean removed = false;

        for (int i = 0; i < listInvoices.size(); i++) {
            if (listInvoices.get(i).getPartNumber().equalsIgnoreCase(cd)) {
                listInvoices.remove(i);
                System.out.println(" Delete successful: " + cd);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Not Found!");
        }
    }
    public static void main(String[] args) {
        createMockedData();

        int chon;
        do {
            System.out.println("\n                MENU                  ");
            System.out.println("1. Nhap them hoa don (khong trung ma cu): ");
            System.out.println("2. Xuat hoa don: ");
            System.out.println("3. Sap xep danh sach theo ma tang dan (Bubble Sort): ");
            System.out.println("4. Tim kiem hoa don (Tìm tuyến tính): ");
            System.out.println("5. Xoa hoa don: ");
            System.out.println("0. Thoat!");
            System.out.print("Nhap so chuc nang (0-5): ");

            try {
                chon = Integer.parseInt(sc.nextLine());
                switch (chon) {
                    case 1: inputInvoice();
                    break;
                    case 2: outputList();
                    break;
                    case 3: arrange_Number();
                    break;
                    case 4: search_Number();
                    break;
                    case 5: del_Number();
                    break;
                    case 0: System.out.println("BYE !");
                    break;
                    default: System.out.println("VUI LONG NHAP LAI SO (0-5) !! SO KHONG HOP LE !!!!!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("VUI LONG NHAP SO NGUYEN !!!!");
                chon = -1;
            }
        } while (chon != 0);
    }


}

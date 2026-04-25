package thuchanh1.minions.buoi4;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Chuong_Trinh_QLSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> DSSV = new ArrayList<>();
		int choice;
		do {
			System.out.println("---- MENU SINH VIEN ----");
			System.out.println("a. Them Sinh vien.");
			System.out.println("\nb. Xuat danh sach sinh vien.");
			System.out.println("\nc. Sua sinh vien.");
			System.out.println("\nd. Xoa sinh vien chua ten bat ky.");
			System.out.println("\ne. Tim sinh vien ma ten co chu An.");
			System.out.println("\nf. Sap xep sinh vien.");
			System.out.println("\ng. Xuat ra so luong sinh vien.");
			System.out.println("\nhaha. Thoat!.");
			System.out.println("Moi ban thoat chuc nang");
			String input = sc.nextLine();
			switch(input.toLowerCase())
			{
			case "a":
				System.out.println("Nhap vao ten sv muon them: ");
				DSSV.add(sc.nextLine());
				System.out.println(" Da them sinh vien thanh cong !");
				break;
			case "b":
				System.out.println("Danh sach sinh vien hien tai: ");
				for(String sv: DSSV)
				{
					System.out.println("- "+sv);
				}
				break;
			case "c":
				System.out.println("Nhap ten sinh vien can sua: ");
				String oldName = sc.nextLine();
				if(DSSV.contains(oldName))
				{
					System.out.println("Nhap ten moi: ");
					String newName = sc.nextLine();
					int index = DSSV. indexOf(oldName);
					DSSV.set(index, newName);
					System.out.println("Sua thanh cong !");
				}else {
					System.out.println("KHONG TIM THAY SINH VIEN NAY !!!!");
				}
				break;
			case "d":
				System.out.println("Nhap ten sinh vien muon xoa: ");
				String deL = sc.nextLine();
				if(DSSV.remove(deL))
				{
					System.out.println("-- Da xoa ten sinh vien thanh cong __");
				}else {
					System.out.println(" KHONG TIM THAY TEN SINH VIEN TRONG DANH SACH !!!!");
				}
				break;
			case "e":
				System.out.println("--Tim sinh vien ten co chu 'An':" );
                boolean found = false;
                for (String sv : DSSV) {
                    if (sv.toLowerCase().contains("an")) {
                        System.out.println("- " + sv);
                        found = true;
                    }
                }
                if (!found) System.out.println("DANH SACH KHONG CO TEN SINH VIEN NAY.");
                break;
            case "f": 
                Collections.sort(DSSV);
                System.out.println("-- Da sap xep thu tu tu a-z.");
                break;
            case "g": 
                System.out.println("Tong so luong sinh vien: " + DSSV.size());
                break;
            case "0":
                System.out.println("---------Merci!----------");
                System.exit(0);
                break;
            default:
                System.out.println("-KHONG HOP LE! VUI LONG NHAP LAI !!!!!!!!!!!!!");
			
			}
		}while(true);
	}

}

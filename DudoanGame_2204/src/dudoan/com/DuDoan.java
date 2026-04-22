package dudoan.com;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
public class DuDoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
	    String Choice;
		do {
		int soCuaMay = rd.nextInt(101);
        int soLuot = 7;
        boolean Win = false;
    
        System.out.println("==== TRÒ CHƠI DỰ  ===");
        System.out.println("Máy đã chọn số [0..100]. Bạn có 7 lượt chơi !");
        int i = 1;
        while (i <= soLuot) {
            try {
                System.out.print("\nLuot doan thu " + i + ": ");
                int soDoan = sc.nextInt(); 
                if (soDoan == soCuaMay) {
                    System.out.println("Bạn đã đúng số !"  + soCuaMay);
                    Win = true;
                    break;
                } else if (soDoan < soCuaMay) {
                    System.out.println("Gợi Ý: Số của bạn NHỎ hơn số của  máy.");
                } else {
                    System.out.println("Gợi ý: Số của bạn LỚN hơn số của .");
                }
                
                i++;
                if (i <= soLuot && !Win) {
                    System.out.println("Bạn còn " + (soLuot - i + 1) + " lượt thử.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Nhập số nguyên. Vui lòng nhập lại !");
                sc.next(); 
            }
        }
        if (!Win) {
            System.out.println("\n--- GAME OVER ---");
            System.out.println("Bạn đã hết lượt! Số may mắn là: " + soCuaMay);
        }
        System.out.print("\nBạn có muốn chơi tiếp không? (Yes/No): ");
        Choice = sc.next();
      } while (Choice.equalsIgnoreCase("Yes")); 
          System.out.println("Cảm ơn bạn đã tham gia trò chơi!");
        sc.close();
    }
}
        


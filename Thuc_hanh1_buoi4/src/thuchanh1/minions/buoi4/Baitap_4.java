package thuchanh1.minions.buoi4;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Baitap_4 {
	public static boolean LaSNT(int n)
	{
		if(n<2) return false;
		for (int i=2; i<=Math.sqrt(n); i++)
		{
			if (n%i==0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong phan tu cua mang : ");
		int n = sc.nextInt();
		int []M = new int[n];
		System.out.println("Nhap cac phan tu cua mang: ");
		for(int i=0; i<n; i++) {
			M[i] = sc.nextInt();
		}  //---- SOLE ------
		System.out.println("- DONG 1: Cac so le: ");
		int Countle = 0;
		for(int i=0; i<n; i++)
		{
			if(M[i]%2!=0) {
				System.out.println(M[i]+"");
				Countle++;
			}
		}
		System.out.println("Tong cong: "+Countle+" So le.");
		// ------ SO CHAN -------
		System.out.println("- DONG 2: Cac so chan: ");
		int CountChan = 0;
		for(int i=0; i<n; i++)
		{
			if(M[i]%2==0) {
				System.out.println(M[i]+"");
				CountChan++;
			}
	}
		System.out.println("Tong cong: "+CountChan+" So chan.");
		// ---- SoNguyenTo ------
		System.out.println("- DONG 3: Cac so nguyen to: ");
		for(int i=0; i<n; i++)
		{
			if(LaSNT(M[i]))
			{
				System.out.println(M[i]+ " ");
			}
		}
		System.out.println("");
		// ---- SoNguyenTo ------
		System.out.println("- DONG 4: KHONG PHAI LA SO NGUYEN TO:");
		for(int i=0; i<n; i++)
		{
			if(!LaSNT(M[i]))
			{
				System.out.println(M[i]+ " ");
			}
		}
		System.out.println("");
		sc.close();
	}

}

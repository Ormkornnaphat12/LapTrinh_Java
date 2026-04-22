package dudoan.com;
import java.util.InputMismatchException;
public class Panlyndrome {
	public static boolean Panlyndrome(String s) {
		
		try {
			if (s == null) {
				throw new Exception ("Null");
			}
			int n = s.length();
			for(int i=0; i<n/2; i++)
			{
				if (s.charAt(i)!=s.charAt(n - 1 - i)) {
					return false;
				}
			}
			return true;
		}catch(Exception ex)
		{
			ex.printStackTrace(); 
            return false;
		}finally {
			System.out.println("Hoan Thanh");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		if(Panlyndrome (s)) {
			System.out.println("'"+ s + " La chuoi Panlyndrome");
		}else
		{
			System.out.println("'"+ s + " Khong phai la chuoi Panlyndrome");
		}
	}

}
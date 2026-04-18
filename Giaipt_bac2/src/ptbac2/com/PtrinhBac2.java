package ptbac2.com;
import java.util.Scanner;
import java.text.DecimalFormat;
public class PtrinhBac2 {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in) ;
		DecimalFormat df = new DecimalFormat("#.###"); 
		double a, b,  c, x1, x2, delta;
		System.out.println("Nhap a = ");
		a = sc.nextDouble();
		System.out.println("Nhap b = ");
		b = sc.nextDouble();
		System.out.println("Nhap c = ");
		c = sc.nextDouble();
		System.out.println("Phuong trinh bac hai co dang "+df.format(a)+"x^2 +" +df.format(b)+"x + "+df.format(c)+" =0 ");
		delta = Math.pow(b,2)-4*a*c;
		if(delta<0) {
			System.out.println("Phuong trinh vo nghiem !");
		}else if (delta == 0) {
			x1= - b/(2*a);
			System.out.println("Phuong trinh co 1 nghiem x1 = " + df.format(x1));	
		}else {
			x1 = (-b+Math.sqrt(delta/2));
		    x2 = (-b-Math.sqrt(delta/2));
		    System.out.println("Phuong trinh co 2 nghiem x1 = "+ df.format(x1)+" x2 = "+ df.format(x2));
		}
	}
	

}

package ucln.wicked.minions;
import java.util.Scanner;
public class ucln {
    public static int Tim_UCLN(int a, int b)
    {
        while (b!=0)
        {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static boolean isFerfectNb(int n)
    {
        if(n <= 1) return false;
        int sum = 0;
        for(int i=1; i <= n/2; i++)
        {
            if(n % i == 0)
            {
                sum += i;
            }
        }
        return sum == n;
    }
    public static boolean EvenOdd(int n)
    {
        n = Math.abs(n);
        if (n == 0) return true;
        while(n > 0)
        {
            int digit = n % 10;
            if (digit % 2 != 0) return false;
            n /= 10;
        }
        return true;
    }
    public static double getFactorial(int k)
    {
        double ft = 1;
        for(int i = 1; i <= k; i++)
            ft *= i;
        return ft;
    }
    public static double Tinh_S(double x, int n)
    {
        double sum = 0;
        for(int i = 0; i <= n; i++)
        {
            int m = 2 * i + 1;
            sum += Math.pow(x, m)/getFactorial(m);
        }
        return sum;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("=== 1: Tim UCLN ===");
        System.out.println("Nhap a = ");
        int a = sc.nextInt();
        System.out.println("Nhap b = ");
        int b = sc.nextInt();
        System.out.println("UCLN = "+Tim_UCLN(a, b));
        //System.out.println("=== 2: SO HOAN THIEN");
        System.out.print("Nhap so can kiem tra: ");
        int n = sc.nextInt();
        if (isFerfectNb(n))
        {
            System.out.println(n+"La so hoan thien ");
        }else{
            System.out.println(n+"KHONG PHAI LA SO HOAN THIEN!");
        }
        //System.out.println("=== 3: CHAN?LE");
        System.out.println("Nhap vao n = ");
        int n3 = sc.nextInt();
        if (EvenOdd(n3))
        {
            System.out.println( n3 + "LA SO LE.");
        }else
        {
            System.out.println( n3 +" La so chan.");
        }
        //.out.println("=== 4:S/n ===");
        System.out.println("Nhap vao x = ");
        double x4 = sc.nextDouble();
        System.out.println(" Nhap vao n = ");
        int n4 = sc.nextInt();
        double resultS = Tinh_S(x4, n4);
        System.out.printf("RESULT: S(%.2f, %d) = %.4f",x4, n4, resultS);
        sc.close();
    }
}

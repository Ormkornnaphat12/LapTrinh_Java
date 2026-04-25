package mang.com;
import java.util.*;
public class BaiTapvemang {
    public static boolean La_SNT(int n)
    {
        if(n<2) return false;
        for (int i=2; i<n; i++)
        {
            if (n%i==0) return false;
        }
        return true;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Nhap vao cac phan tu: ");
        for(int i=0; i<n; i++)
        {
            System.out.println("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
        System.out.println("Mang vua nhap:");
        for(int x: a)
        {
            System.out.println(x+" ");
        }
        int sum = 0;
        for(int x: a)
        {
            sum += x;
        }
        System.out.println("Tong mang = "+ sum);
        System.out.println("nhap k: ");
        int k = sc.nextInt();
        int Count = 0;
        for(int x : a)
        {
            if(x == k)Count++;
        }
        System.out.println("So lan xuat hien cua " + k+ " = "+Count);
        int max = a[0], min = a[0];
        for(int x : a)
        {
            if(x > max) max = x;
            if(x < min) min = x;
        }
        System.out.println("Phan tu LON nhat trong mang = " +max);
        System.out.println("Phan tu NHO nhat trong mang = " +min);
        System.out.println("Cac so nguyen to: ");
        for (int x : a)
        {
            if(La_SNT(x))
            {
                System.out.println(x+ " ");
            }
        }
        int [] tang = a.clone();
        Arrays.sort(tang);
        System.out.println("Mang tang dan: ");
        for(int x : a)
        {
            System.out.println(x+" ");
        }
        int [] giam = a.clone();
        Arrays.sort(giam);
        System.out.println("Mang giam dan: ");
        for(int i = giam.length-1; i>=0; i--)
        {
            System.out.println(giam[i]+" ");
        }
        sc.close();
    }
}

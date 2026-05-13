package ucln.wicked.minions;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CT_demsoam {
    public static void NegativeNumberInStrings (String s)
    {
        Pattern pattern = Pattern.compile("-\\d+");
        Matcher matcher = pattern.matcher(s);
        int count = 0;
        System.out.println("Cac so nguyen am trong chuoi:");
        while (matcher.find()) {
            System.out.println(matcher.group());
            count++;
        }
        System.out.println("Tong so am: " + count);
    }
     static void main(String[] args) {

        //String str = "abc-5xyz-12k9l--p";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String s = sc.nextLine();
        NegativeNumberInStrings(s);
        sc.close();
    }
}

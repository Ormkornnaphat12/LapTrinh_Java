package staff.alien.banana;
import java.util.ArrayList;

public class staff {
    private ArrayList<StaffMember> staffList;
    public staff()
    {
        staffList = new ArrayList<>();
        staffList.add(new Executive("Timothy Donald Cook", "Soc Trang", "0120120120", "123-456", 1500));
        staffList.add(new Hourly("Cardi B", "TP.HCM", "095678789", "789-012", 40));
        staffList.add(new Volunteer("Cristiano Ronaldo", "Vinh Long", "0777777777"));
    }

    public void payday() {
        for (StaffMember member : staffList) {
            System.out.println(member.toString());
            double amount = member.pay();
            if (amount == 0.0) {
                System.out.println("--- Volumteer( no salary ) ---");
            } else {
                System.out.println(" SALARY : " + amount);
            }
            System.out.println("---------------------------------");
        }
    }
}

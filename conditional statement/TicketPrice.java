import java.util.Scanner;
public class TicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        if (age<12) {
            System.out.println("Ticket Price: ₹50 (Child)");
        } else if (age<60) {
            System.out.println("Ticket Price: ₹100 (Adult)");
        } else {
            System.out.println("Ticket Price: ₹70 (Senior Citizen)");
        }
    }
}

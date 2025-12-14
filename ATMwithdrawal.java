import java.util.Scanner;
public class ATMwithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance=10000;
        int amount=sc.nextInt();
        if (amount<=balance&&amount%100==0) {
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Invalid withdrawal request");
        }
    }
}

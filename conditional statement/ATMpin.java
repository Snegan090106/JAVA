import java.util.Scanner;
public class ATMpin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int storedPin=1234;
        int pin=sc.nextInt();
        if (pin==storedPin) {
            System.out.println("PIN correct.");
        } else {
            System.out.println("Incorrect PIN.");
        }
    }
}

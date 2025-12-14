import java.util.Scanner;
public class FeverCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter body temperature: ");
        double temp=sc.nextDouble();
        if (temp>100) {
            System.out.println("detected");
        } else {
            System.out.println("Normal temperature");
        }
    }
}

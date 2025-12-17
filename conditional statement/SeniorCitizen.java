import java.util.Scanner;
public class SeniorCitizen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age=sc.nextInt();

        if (age>=60) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
    }
}

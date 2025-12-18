import java.util.Scanner;
public class Multpositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a positive number (or a negative number to stop): ");
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println("The sum of the positive numbers is: " + sum);
        scanner.close();
    }
}
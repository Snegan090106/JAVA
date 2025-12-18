import java.util.Scanner;
public class Sumpos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        int sum = 0;
        int count = 0;

        while (count < N) {
            System.out.print("Enter a positive number: ");
            int number = scanner.nextInt();
            if (number >= 0) {
                sum += number;
                count++;
            } else {
                System.out.println("Negative number entered. Please enter a positive number.");
            }
        }

        System.out.println("The sum of the " + N + " positive numbers is: " + sum);
        scanner.close();
    }
}
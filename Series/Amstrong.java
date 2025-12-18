import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Armstrong numbers from 1 to " + N + " are:");
        for (int num = 1; num <= N; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        return sum == originalNumber;
    }
}
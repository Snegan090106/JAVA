import java.util.Scanner;
public class Strong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Strong numbers from 1 to " + N + " are:");
        for (int num = 1; num <= N; num++) {
            if (isStrong(num)) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }

    public static boolean isStrong(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum == originalNumber;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
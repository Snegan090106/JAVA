import java.util.Scanner;
public class Perfectnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Perfect numbers from 1 to " + N + " are:");
        for (int num = 1; num <= N; num++) {
            if (isPerfect(num)) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
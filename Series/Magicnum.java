import java.util.Scanner;
public class Magicnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Magic numbers from 1 to " + N + " are:");
        for (int num = 1; num <= N; num++) {
            if (isMagicNumber(num)) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }

    public static boolean isMagicNumber(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum == 1;
    }
}
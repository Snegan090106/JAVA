import java.util.Scanner;
public class Buzznum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Buzz numbers from 1 to " + N + " are:");
        for (int num = 1; num <= N; num++) {
            if (isBuzzNumber(num)) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }

    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }
}
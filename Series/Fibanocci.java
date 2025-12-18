import java.util.Scanner;
public class Fibanocci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms N: ");
        int N = scanner.nextInt();

        System.out.println("Fibonacci series up to " + N + " terms:");
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
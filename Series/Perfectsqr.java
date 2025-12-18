import java.util.Scanner;
public class Perfectsqr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Perfect square numbers from 1 to " + N + " are:");
        for (int i = 1; i * i <= N; i++) {
            System.out.print((i * i) + " ");
        }
        scanner.close();
    }
}
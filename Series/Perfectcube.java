import java.util.Scanner;
public class Perfectcube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Perfect cube numbers from 1 to " + N + " are:");
        for (int i = 1; i * i * i <= N; i++) {
            System.out.print((i * i * i) + " ");
        }
        scanner.close();
    }
}
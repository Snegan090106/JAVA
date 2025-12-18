import java.util.Scanner;
public class Fibanoccilimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number limit N: ");
        int N = scanner.nextInt();

        System.out.println("Fibonacci series up to the limit " + N + ":");
        int a = 0, b = 1;
        while (a <= N) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        scanner.close();
    }
}
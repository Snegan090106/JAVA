import java.util.Scanner;
public class Powof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Power of 2 numbers from 1 to " + N + " are:");
        int powerOfTwo = 1;
        while (powerOfTwo <= N) {
            System.out.print(powerOfTwo + " ");
            powerOfTwo *= 2;
        }
        scanner.close();
    }
}

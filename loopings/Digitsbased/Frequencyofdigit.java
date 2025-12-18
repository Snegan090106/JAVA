//Q8. Write a java program to find the frequency of each digit in a given number.
import java.util.Scanner;
public class Frequencyofdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        int[] frequency = new int[10];
        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }
        System.out.println("Digit frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }
        scanner.close();
    }
}
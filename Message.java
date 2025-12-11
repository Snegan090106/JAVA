//to get message as a input and print the message
import java.util.Scanner;
public class Message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        System.out.println("Your message is: " + message);
        scanner.close();
    }
}


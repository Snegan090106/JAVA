// to check whether a number is divisible by either 3 or 7
public class Divby3or7 {
    public static void main(String[] args) {
        int number = 28;
        if (number % 3 == 0 || number % 7 == 0) {
            System.out.println(number + " is divisible by either 3 or 7");
        } else {
            System.out.println(number + " is not divisible by either 3 or 7");
        }
    }
}
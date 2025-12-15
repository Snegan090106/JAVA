// to check whether a number is a single-digit, two-digit, or three-digit number
public class Digit1or2or3 {
    public static void main(String[] args) {
        int number = 45;
        if (number >= 0 && number <= 9) {
            System.out.println(number + " is a single-digit number");
        } else if (number >= 10 && number <= 99) {
            System.out.println(number + " is a two-digit number");
        } else if (number >= 100 && number <= 999) {
            System.out.println(number + " is a three-digit number");
        } else {
            System.out.println(number + " is not a single-digit, two-digit, or three-digit number");
        }
    }
}
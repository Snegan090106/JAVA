//to check whether a number is divisible by both 2 and 5 but not by 8.
public class Divby5and7not8 {
    public static void main(String[] args) {
        int number = 70;
        if (number % 5 == 0 && number % 7 == 0 && number % 8 != 0) {
            System.out.println(number + " is divisible by both 5 and 7 but not by 8");
        } else {
            System.out.println(number + " does not meet the criteria");
        }
    }
}
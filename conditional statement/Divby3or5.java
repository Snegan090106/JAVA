//to check whether a number is divisible by both 3 and 5
public class Divby3or5 {
    public static void main(String[] args) {
        int number = 45;
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is divisible by both 3 and 5");
        } else {
            System.out.println(number + " is not divisible by both 3 and 5");
        }
    }
}
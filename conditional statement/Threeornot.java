//to find whether the given number is 3 digit number or not
public class Threeornot {
    public static void main(String[] args) {
        int number = 256;
        if (number >= 100 && number <= 999) {
            System.out.println(number + " is a three-digit number");
        } else {
            System.out.println(number + " is not a three-digit number");
        }
    }
}

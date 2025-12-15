//to check whether a number is positive, negative, or zero
public class Posornegorzero {
    public static void main(String[] args) {
        int number = -5;
        if (number > 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println("The number is zero");
        }
    }
}
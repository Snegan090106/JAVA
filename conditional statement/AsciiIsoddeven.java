//to check whether the ASCII value of a character is even or odd.
public class asciiIsoddeven {
    public static void main(String[] args) {
        char ch = 'A';
        int asciiValue = (int) ch;
        if (asciiValue % 2 == 0) {
            System.out.println("The ASCII value of '" + ch + "' which is " + asciiValue + " is an even number");
        } else {
            System.out.println("The ASCII value of '" + ch + "' which is " + asciiValue + " is an odd number");
        }
    }
}
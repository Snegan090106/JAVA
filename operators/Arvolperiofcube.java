//to find Surface Area, Volume, and Perimeter of a cube
import java.util.Scanner;
class Arvolperiofcube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double surfaceArea = 4 * Math.PI * radius * radius;
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Surface Area: %.2f\n", surfaceArea);
        System.out.printf("Volume: %.2f\n", volume);
        System.out.printf("Circumference: %.2f\n", circumference);
        sc.close();
    }
}

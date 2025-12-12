//to find Surface Area and Volume of a Sphere
import java.util.Scanner;
class Avpofsphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double surfaceArea = 4 * Math.PI * radius * radius;
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.printf("Surface Area: %.2f\n", surfaceArea);
        System.out.printf("Volume: %.2f\n", volume);
        sc.close();
    }
}
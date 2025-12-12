// to find Surface Area and Volume of a Cylinder
import java.util.Scanner;
class Avpofcylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        double volume = Math.PI * radius * radius * height;
        System.out.printf("Surface Area: %.2f\n", surfaceArea);
        System.out.printf("Volume: %.2f\n", volume);
        sc.close();
    }
}
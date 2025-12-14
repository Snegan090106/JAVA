//to find area of Triangle
import java.util.Scanner;
public class Areatriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int h=sc.nextInt();
        int area=(b*h)/2;
        System.out.println(area);
        sc.close();
    }
}
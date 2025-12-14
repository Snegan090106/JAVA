// to calculate Javaelsius to Fahrenheit
import java.util.Scanner;
public class Celtofh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double c=sc.nextDouble();
        double f=(c*9/5)+32; // formula to convert Celsius to Fahrenheit is (C*9/5)+32
        System.out.println(f);
        sc.close();
    }
}
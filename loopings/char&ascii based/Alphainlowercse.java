//Q1. Write a Java program to print all English alphabets in uppercase.
import java.util.Scanner;
public class Alphainlowercse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        sc.close();
    }
}

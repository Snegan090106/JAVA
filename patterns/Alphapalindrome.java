//Q25.Write a Java program to print a reverse alphabet palindrome pyramid.
import java.util.Scanner;
public class Alphapalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            char ch=(char)('A'+i-1);
            for(int k=1;k<=i;k++){
                System.out.print(ch+" ");
                ch--;
            }
            ch+=2;
            for(int l=2;l<=i;l++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
import java.util.Scanner;
public class Triangleofthree{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b&&b==c){
          System.out.println("all sides are equal");
        }else if(a==b||b==c||c==a){
            System.out.println("any two sides are equal");
        }else{
            System.out.println("all sides are diff");
        }
        sc.close();
    }
    }
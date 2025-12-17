import java.util.Scanner;
public class Sqrrec{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(a==b&&b==c&&c==d){
          System.out.println("sqr");
        }else if(a==c&&b==d){
            System.out.println("rec");
        }
        else{
            System.out.println("invalid");
        }
        sc.close();
    }
    }
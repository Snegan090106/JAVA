import java.util.Scanner;
public class Validtriangle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b+c==180&&a>0&&a>0&&c>0){
          System.out.println("valid triangle");
        }else{
            System.out.println("not valid triangle");
        }
        sc.close();
    }
    }
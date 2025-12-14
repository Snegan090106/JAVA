 import java.util.Scanner;
public class Shoploss{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cp=sc.nextInt();
        int loss=sc.nextInt();
        int Sellingprice=cp+loss;
        System.out.println(Sellingprice);
        sc.close();
    }
} 
    

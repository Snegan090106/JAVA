//A fruit shop has an offer: Buy 3 mangoes and get 1 free. Based on the mango price and total mangoes purchased, compute total mangoes received and amount to pay.
import java.util.Scanner;
public class Mango {    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int pricePerMango=sc.nextInt();
        int mangoesPurchased=sc.nextInt();
        int freeMangoes=mangoesPurchased/3;
        int totalMangoes=mangoesPurchased+freeMangoes;
        int amountToPay=pricePerMango*mangoesPurchased;
        System.out.println("Total mangoes received: " + totalMangoes);
        System.out.println("Amount to pay: " + amountToPay);
        sc.close();
    }
}
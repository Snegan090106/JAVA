import java.util.Scanner;
public class Sumoddeven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sumodd=0;
        int sumeven=0;
        for(int i=0;i<=n;i++){
           if(i%2==0){
            sumeven=sumeven+i;
        }else{
            sumodd=sumodd+i;
        }
}
 System.out.println("sum of odd numbers" + sumodd);
           System.out.println("sum of even number" + sumeven);
sc.close();
}}


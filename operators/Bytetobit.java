import java.util.Scanner;
public class Bytetobit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int by=sc.nextInt();
        int bit=8*by;
        System.out.println(bit);
        sc.close();
    }
}

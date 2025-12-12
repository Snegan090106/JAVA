    import java.util.Scanner;
    class Discountprblm {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double originalPrice = sc.nextDouble();
            double discountPercentage = sc.nextDouble();
            double discountAmount = (discountPercentage / 100) * originalPrice;
            double discountedPrice = originalPrice - discountAmount;
            System.out.println(discountedPrice);
            sc.close();
        }
    }

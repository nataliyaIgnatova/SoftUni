import java.util.Scanner;

public class e9Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());

        float totalPrice = 0;
        float sum = 0;

        for (int i = 1; i <= orders ; i++) {

            float priceCapsule = Float.parseFloat(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            totalPrice = (days * capsuleCount) *priceCapsule;

            System.out.printf("The price for the coffee is: %.2f%n",totalPrice);
            sum+=totalPrice;
        }
        System.out.printf("Total: %.2f",sum);



    }
}

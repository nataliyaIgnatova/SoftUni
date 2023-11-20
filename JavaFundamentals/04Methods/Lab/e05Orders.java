import java.util.Scanner;

public class e05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();
        int quantityInput = Integer.parseInt(scanner.nextLine());;

        printTotalAmount(productInput, quantityInput);
    }
    public static void printTotalAmount(String product, double quantity){

        double price = 0;

        switch (product){
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks" :
                price = 2.00;
                break;
        }
        System.out.println(quantity*price);

    }
}

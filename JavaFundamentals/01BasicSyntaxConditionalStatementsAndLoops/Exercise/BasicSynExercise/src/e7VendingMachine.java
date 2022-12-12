import java.util.Scanner;

public class e7VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sum = 0;
        double price = 0;
        double sumPrice = 0;

        while(!input.equals("Start")){

            double coins = Double.parseDouble(input);
            if(coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1.0 || coins == 2.0){

                sum+=coins;

            }else {
                System.out.printf("Cannot accept %.2f%n",coins);
                coins = 0;

            }

            input = scanner.nextLine();
        }

            while(!input.equals("End")){

                input = scanner.nextLine();


                switch (input){


                    case "Nuts":
                        price = 2.0;
                        break;

                    case "Water":
                        price = 0.7;
                        break;

                    case "Crisps":
                        price = 1.5;
                        break;

                    case "Soda":
                        price = 0.8;
                        break;

                    case "Coke":
                        price = 1.0;
                        break;

                    case"End":
                        continue;

                    default:
                        System.out.println("Invalid product");
                        break;

                }
                if (sum<price){
                    System.out.println("Sorry, not enough money");

                }else{
                    System.out.printf("Purchased %s%n",input );
                    sum-=price;
                }


            }


        System.out.printf("Change: %.2f",sum);

}
}


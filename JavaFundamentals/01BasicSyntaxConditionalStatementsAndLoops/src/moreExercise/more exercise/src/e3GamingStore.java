import java.util.Scanner;

public class e3GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        double totalSpend = 0;

        while (!command.equals("Game Time")){

            double priceGame =0;

            switch (command){

                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    priceGame = 39.99;
                   break;
                case "Cs: OG":
                    priceGame  = 15.99;
                    break;
                case "Zplinter Zell":
                    priceGame  = 19.99;
                    break;
                case "Honored 2" :
                   priceGame = 59.99;
                    break;
                case "RoverWatch":
                    priceGame = 29.99;
                    break;

                default:
                    System.out.println("Not Found");
                    command = scanner.nextLine();
                    continue;
            }
            if(currentBalance < priceGame){
                System.out.println("Too Expensive");
            }else{
                currentBalance -= priceGame;
                totalSpend += priceGame;
                System.out.printf("Bought %s%n",command);
            }

            if(currentBalance == 0){
                System.out.println("Out of money!");
                command = scanner.nextLine();
                continue;
            }
            command = scanner.nextLine();


        }
        if(currentBalance > 0){
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f"
                ,totalSpend,currentBalance);
    }
    }
}

package exam1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double sumDegrees = 0;
        double sumLiters = 0;


        for (int i = 1; i <= n ; i++) {

            double quantity = Double.parseDouble(scanner.nextLine());
            double degrees = Double.parseDouble(scanner.nextLine());


            sumLiters += quantity;
            sumDegrees =  sumDegrees + degrees * quantity;



        }

        double averageDegrees = sumDegrees / sumLiters ;

        if(averageDegrees < 38){
            System.out.printf("Liter: %.2f%n",sumLiters);
            System.out.printf("Degrees: %.2f%n",averageDegrees);
            System.out.println("Not good, you should baking!");

        }else if(averageDegrees > 42){
            System.out.printf("Liter: %.2f%n",sumLiters);
            System.out.printf("Degrees: %.2f%n",averageDegrees);
            System.out.println("Dilution with distilled water!");
        }
        else {
            System.out.printf("Liter: %.2f%n",sumLiters);
            System.out.printf("Degrees: %.2f%n",averageDegrees);
            System.out.println("Super!");

        }




    }
}

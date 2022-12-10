package exam1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysMissing = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double foodFirst = Double.parseDouble(scanner.nextLine());
        double foodSecond = Double.parseDouble(scanner.nextLine());
        double foodThird = Double.parseDouble(scanner.nextLine());


        double sumFirst = daysMissing * foodFirst;
        double sumSecond = daysMissing * foodSecond;
        double  sumThird = daysMissing * foodThird;
        double allSum = sumFirst + sumThird + sumSecond;

        if(allSum <= foodLeft ){
            System.out.printf("%.0f kilos of food left.",Math.floor(foodLeft - allSum));

        }else{
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(allSum - foodLeft));

        }







    }
}

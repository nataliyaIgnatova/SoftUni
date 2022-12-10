package exam1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;
        double discount = 0;
        double sum = 0;

        if(people <= 5){

       switch (season){

           case "spring":
               price = 50;
               sum = people * price;
               break;
           case "summer":
               price = 48.50;
               discount =48.50 - 48.50 *  0.15;
               sum = people * discount;

               break;
           case "autumn":
               price = 60;
               sum = people * price;
               break;
           case"winter":
               price = 86;
               discount = 86 + 86*0.08;
               sum = people * discount;
               break;

       }

        }
        else{
            switch (season){
                case "spring":
                    price = 48;
                    sum = people * price;
                    break;
                case "summer":
                    price = 45;
                    discount =45 - 45 *  0.15;
                    sum = people * discount;
                    break;
                case "autumn":
                    price = 49.50;
                    sum = people * price;
                    break;
                case"winter":
                    price = 85;
                    discount = 85 + 85 * 0.08;
                    sum = people * discount;
                    break;

            }
        }

        System.out.printf("%.2f leva.", sum);


        }




    }


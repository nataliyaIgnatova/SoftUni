import java.util.Scanner;

public class e3Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupCount = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double allPrice = 0;
        double priceOne = 0;

        if(typeGroup.equals("Students")){

            switch (day){
                case"Friday" :
                    priceOne = 8.45;
                    break;

                case "Saturday":
                    priceOne = 9.80;
                    break;

                case "Sunday":
                    priceOne = 10.46;
                    break;

            }
            allPrice = priceOne * groupCount;
            if(groupCount >=30){
            allPrice = allPrice - allPrice*0.15;
            }

        }else if (typeGroup.equals("Business")){
                switch (day){
                    case"Friday" :
                        priceOne = 10.90;
                        break;

                    case "Saturday":
                        priceOne = 15.60;
                        break;

                    case "Sunday":
                        priceOne = 16;
                        break;

                }
            allPrice = priceOne * groupCount;
                if(groupCount >= 100){
                allPrice = (groupCount -10) * priceOne;
                }
        }else if (typeGroup.equals("Regular")){
            switch (day){
                case"Friday" :
                    priceOne = 15;
                    break;

                case "Saturday":
                    priceOne = 20;
                    break;

                case "Sunday":
                    priceOne = 22.50;
                    break;

        }
        allPrice = priceOne * groupCount;

            if(groupCount >= 10 && groupCount <=20){
                allPrice = allPrice - allPrice* 0.05;

            }
        }

        System.out.printf("Total price: %.2f",allPrice);







    }
}

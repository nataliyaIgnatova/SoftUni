import java.util.Scanner;

public class e7TheatrePromotions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int priceTicket = 0;

        if (day.equals("Weekday")){
            if(age >=0 && age <= 18){
                priceTicket = 12;
            } else if (age > 18 && age <=64) {
                priceTicket = 18;
            }else if(age > 64 && age <= 122) {
                priceTicket = 12;

            }

        }
        else if(day.equals("Weekend")){
            if(age >=0 && age <= 18){
                priceTicket = 15;
            } else if (age > 18 && age <=64) {
                priceTicket = 20;
            }else if(age > 64 && age <= 122) {
                priceTicket = 15;

            }

        }else if(day.equals("Holiday")){
            if(age >=0 && age <= 18){
                priceTicket = 5;
            } else if (age > 18 && age <=64) {
                priceTicket = 12;
            }else if(age > 64 && age <= 122) {
                priceTicket = 10;

            }
        }
        if(age >= 0 && age <= 122){
            System.out.printf("%d$",priceTicket);
        }else{
            System.out.println("Error!");
        }






    }
}

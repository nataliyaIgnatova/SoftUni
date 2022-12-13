import java.util.Scanner;

public class e10PadawanEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyHave = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceSingleSaber = Double.parseDouble(scanner.nextLine());
        double singleRobePrice = Double.parseDouble(scanner.nextLine());
        double singleBeltPrice = Double.parseDouble(scanner.nextLine());

        double totalCost = 0;
        double totalRobe = countStudents * singleRobePrice;
        double totalSaber = priceSingleSaber *( countStudents + Math.ceil(countStudents * 0.10));
        double totalBelt = 0;
        int beltCounter = 0;

        for (int i = 1; i <=countStudents ; i++) {

            beltCounter++;
            if(i % 6 == 0){
                beltCounter--;
            }


        }
        totalBelt = beltCounter * singleBeltPrice;

        totalCost = totalBelt + totalSaber + totalRobe;

        if (totalCost > moneyHave){
            System.out.printf("George Lucas will need %.2flv more.",totalCost - moneyHave);
        }else{
            System.out.printf("The money is enough - it would cost %.2flv.",totalCost);
        }










    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());

        String [] dayOfWeekArr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}

                if(day >= 1 && day <= 7 ){
                    System.out.println(dayOfWeekArr[day - 1]);
                }else{
                    System.out.println("Invalid day!");
                }


    }
}